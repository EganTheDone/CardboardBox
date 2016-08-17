/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cardboardbox.player.*;
import cardboardbox.rolls.HeroicRoll;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author egand
 */
public class HeroicImporter {

    public Player loadCharacter(String name) throws JDOMException, IOException {
        Player player = new Player();
        Element sheet = load(name);
        List<Element> attr = sheet.getChildren();
        player.setInfo(formatBio(attr.get(0)));
        player.setCharState(formatCharState(attr.get(1)));
        player.setHealthState(formatHealth(attr.get(2)));
        player.setSkills(formatSkills(attr.get(3)));
        player.setAbilities(formatSpellbook(attr.get(4)));
        player.setTurn(false);
        player.setHeroicRoll(new HeroicRoll());

        return player;
    }

    private Element load(String name) throws JDOMException, IOException {
        File file = new File("src/importer/"+name+".xml");
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(file);
         XMLOutputter xmlOutput = new XMLOutputter();
        //check

        xmlOutput.setFormat(Format.getPrettyFormat());
        xmlOutput.output(doc, System.out);
        Element root = doc.getRootElement();
        return root;
    }

    private Document create(Player player) {
        SheetConstructor cs = new SheetConstructor();

        //root
        Element character = new Element("character");
        Document doc = new Document(character);
        //formats to XML
        Element bio = cs.constructBiography(player.getInfo());
        Element charState = cs.constructCharState(player.getCharState());
        Element healthState = cs.constructHealthState(player.getHealthState());
        Element hSkills = cs.constructSkills(player.getSkills());
        Element spellbook = cs.constructSpellbook(player.getAbilities());
        doc.getRootElement().addContent(bio);
        doc.getRootElement().addContent(charState);
        doc.getRootElement().addContent(healthState);
        doc.getRootElement().addContent(hSkills);
        doc.getRootElement().addContent(spellbook);
        return doc;

    }

    public void save(Player player, String name) throws IOException, TransformerConfigurationException, TransformerException {
        Document doc = create(player);
        System.out.println("----------------------");
        XMLOutputter xmlOutput = new XMLOutputter();
        //check

        xmlOutput.setFormat(Format.getPrettyFormat());
        FileWriter fw = new FileWriter("src/importer/"+name+".xml");
        xmlOutput.output(doc, fw);
    }

    private Biography formatBio(Element bio) {
        Biography info = new Biography();
        info.importChar(bio.getChild("name").getText(),
                Integer.valueOf(bio.getChild("age").getText()),
                bio.getChild("job").getText(), bio.getChild("race").getText(),
                Double.valueOf(bio.getChild("height").getText()),
                Double.valueOf(bio.getChild("weight").getText()),
                bio.getChild("morality").getText());
        return info;
    }

    private CharacterState formatCharState(Element state) {
        CharacterState st = new CharacterState();
        List<Element> list = state.getChildren().get(6).getChildren();
        ArrayList<Feats> featList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            featList.add(formatFeats(list.get(i)));
        }
        st.construct(Integer.valueOf(state.getChild("currentExp").getText()),
                Integer.valueOf(state.getChild("spentExp").getText()),
                Integer.valueOf(state.getChild("level").getText()),
                Integer.valueOf(state.getChild("threshold").getText()),
                state.getChild("charClass").getText(), featList);

        return st;
    }

    private HealthState formatHealth(Element health) {
        HealthState hp = new HealthState(Integer.valueOf(health.getChild("health").getText()),
                Integer.valueOf(health.getChild("will").getText()));
        return hp;
    }

    private HeroicSkills formatSkills(Element skills) {
        ArrayList<int[]> skillArr = new ArrayList<>();
        List<Element> sklst = skills.getChildren();

        for (int i = 0; i < sklst.size(); i++) {
            int arr[] = new int[5];
            List<Element> temp = sklst.get(i).getChildren();
            for (int n = 0; n < arr.length; n++) {
                arr[n] = Integer.valueOf(temp.get(n).getText());
            }
            skillArr.add(arr);
        }
        HeroicSkills hSkill = new HeroicSkills(skillArr);
        return hSkill;
    }

    private Spellbook formatSpellbook(Element spellbook) {
        List<Element> bk = spellbook.getChildren();
        List<Element> physBook = bk.get(0).getChildren();
        List<Element> magBook = bk.get(1).getChildren();
        ArrayList<Spell> physical = new ArrayList<>();
        ArrayList<Spell> magical = new ArrayList<>();
        for (int i = 0; i < physBook.size(); i++) {
            physical.add(formatSpell(physBook.get(i)));
        }
        for (int i = 0; i < magBook.size(); i++) {
            magical.add(formatSpell(magBook.get(i)));
        }
        Spellbook book = new Spellbook(physical, magical);
        return book;
    }

    private Feats formatFeats(Element feat) {
        Feats temp = new Feats(feat.getChild("name").getText(), feat.getChild("description").getText(),
                Integer.valueOf(feat.getChild("cost").getText()), feat.getChild("category").getText());
        return temp;
    }

    private Spell formatSpell(Element spell) {
        Spell temp = new Spell(Integer.valueOf(spell.getChild("id").getText()),
                spell.getChild("name").getText(),
                spell.getChild("description").getText(),
                Integer.valueOf(spell.getChild("cost").getText()));
        return temp;
    }

}
