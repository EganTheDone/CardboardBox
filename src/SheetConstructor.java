/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cardboardbox.player.*;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import org.jdom2.Element;

/**
 *
 * @author egand
 */
public class SheetConstructor {

    protected Element constructBiography(Biography info) {
        Element biography = new Element("Biography");
        Element name = new Element("name");
        Element age = new Element("age");
        Element job = new Element("job");
        Element race = new Element("race");
        Element height = new Element("height");
        Element weight = new Element("weight");
        Element morality = new Element("morality");
        name.addContent(info.getName());
        age.addContent(valueOf(info.getAge()));
        job.addContent(info.getJob());
        race.addContent(info.getRace());
        height.addContent(valueOf(info.getHeight()));
        weight.addContent(valueOf(info.getWeight()));
        morality.addContent(valueOf(info.getMorality()));
        biography.addContent(name);
        biography.addContent(age);
        biography.addContent(job);
        biography.addContent(race);
        biography.addContent(height);
        biography.addContent(weight);
        biography.addContent(morality);

        return biography;
    }

    protected Element constructCharState(CharacterState state) {
        Element ch = new Element("CharacterState");
        Element txp = new Element("totExp");
        Element cxp = new Element("currentExp");
        Element spxp = new Element("spentExp");
        Element level = new Element("level");
        Element thrsh = new Element("threshold");
        Element charClass = new Element("charClass");
        Element featList = new Element("featList");
        ArrayList<Feats> feats = state.getFeats();
        feats.stream().forEach((f) -> {
            featList.addContent(constructFeats(f));
        });
        txp.addContent(valueOf(state.getTotalExp()));
        cxp.addContent(valueOf(state.getCurrentExp()));
        spxp.addContent(valueOf(state.getSpentExp()));
        level.addContent(valueOf(state.getLevel()));
        thrsh.addContent(valueOf(state.getThreshold()));
        charClass.addContent(valueOf(state.getCharClass()));
        ch.addContent(txp);
        ch.addContent(cxp);
        ch.addContent(spxp);
        ch.addContent(level);
        ch.addContent(thrsh);
        ch.addContent(charClass);
        ch.addContent(featList);
        return ch;
    }

    protected Element constructHealthState(HealthState health) {
        Element heal = new Element("HealthState");
        Element hp = new Element("health");
        Element will = new Element("will");
        Element status = new Element("status");
        hp.addContent(valueOf(health.getPlayerHealth()));
        will.addContent(valueOf(health.getPlayerWill()));
        status.addContent(health.getStatus());
        heal.addContent(hp);
        heal.addContent(will);
        heal.addContent(status);
        return heal;
    }

    protected Element constructSkills(HeroicSkills skills) {
        Element root = new Element("Skills");
        SkillConstructor sc = new SkillConstructor();
        Element cha = sc.charisma(skills.getCharisma());
        Element com = sc.combat(skills.getCombat());
        Element con = sc.constitution(skills.getConstitution());
        Element dex = sc.dexterity(skills.getDexterity());
        Element intel = sc.intelligence(skills.getIntelligence());
        Element melee = sc.melee(skills.getMelee());
        Element range = sc.ranged(skills.getRanged());
        Element str = sc.strength(skills.getStrength());
        Element wis = sc.wisdom(skills.getWisdom());
        root.addContent(cha);
        root.addContent(com);
        root.addContent(con);
        root.addContent(dex);
        root.addContent(intel);
        root.addContent(melee);
        root.addContent(range);
        root.addContent(str);
        root.addContent(wis);
        return root;
    }

    protected Element constructSpellbook(Spellbook book) {
        Element spellbook = new Element("Spellbook");
        Element physical = new Element("Physical");
        Element magical = new Element("Magical");
        ArrayList<Spell> phys = book.getPhysical();
        ArrayList<Spell> mag = book.getMagic();
        phys.stream().forEach((s) -> {
            physical.addContent(constructSpell(s));
        });
        mag.stream().forEach((s) -> {
            magical.addContent(constructSpell(s));
        });
        spellbook.addContent(physical);
        spellbook.addContent(magical);
        return spellbook;
    }

    protected Element constructFeats(Feats f) {
        Element feat = new Element("feat");
        Element name = new Element("name");
        Element description = new Element("description");
        Element category = new Element("category");
        Element cost = new Element("cost");
        String[] arr = f.rawFF();
        name.addContent(arr[0]);
        description.addContent(arr[1]);
        cost.addContent(arr[2]);
        category.addContent(arr[3]);
        feat.addContent(name);
        feat.addContent(description);
        feat.addContent(cost);
        feat.addContent(category);
        return feat;
    }

    protected Element constructSpell(Spell spell) {
        Element spells = new Element("spell");
        Element id = new Element("id");
        Element name = new Element("name");
        Element description = new Element("description");
        Element cost = new Element("cost");
        id.addContent(valueOf(spell.getID()));
        name.addContent(spell.getName());
        description.addContent(spell.getDescription());
        cost.addContent(valueOf(spell.getExpCost()));
        spells.addContent(id);
        spells.addContent(name);
        spells.addContent(description);
        spells.addContent(cost);
        return spells;
    }

}
