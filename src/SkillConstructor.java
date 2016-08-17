/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cardboardbox.player.heroicSkills.*;
import static java.lang.String.valueOf;
import org.jdom2.Element;

/**
 *
 * @author egand
 */
public class SkillConstructor {

    protected Element charisma(Charisma charisma) {
        Element cha = new Element("Charisma");
        Element hustle = new Element("hustle");
        hustle.addContent(valueOf(charisma.getHustle()));
        Element intim = new Element("intimidate");
        intim.addContent(valueOf(charisma.getIntimidate()));
        Element speech = new Element("speech");
        speech.addContent(valueOf(charisma.getSpeech()));
        Element per = new Element("perform");
        per.addContent(valueOf(charisma.getPerform()));
        Element rank = new Element("rank");
        rank.addContent(valueOf(charisma.getRank()));
        cha.addContent(hustle);
        cha.addContent(intim);
        cha.addContent(speech);
        cha.addContent(per);
        cha.addContent(rank);
        return cha;
    }

    protected Element combat(Combat combat) {
        Element com = new Element("Combat");
        Element magic = new Element("magic");
        Element rune = new Element("rune");
        Element place = new Element("placeholder");
        Element defense = new Element("defense");
        Element rank = new Element("rank");
        magic.addContent(valueOf(combat.getMagic()));
        rune.addContent(valueOf(combat.getRuneK()));
        place.addContent("0");
        defense.addContent(valueOf(combat.getDefense()));
        rank.addContent(valueOf(combat.getRank()));
        com.addContent(magic);
        com.addContent(rune);
        com.addContent(defense);
        com.addContent(place);
        com.addContent(rank);
        return com;
    }

    protected Element constitution(Constitution cons) {
        Element con = new Element("Constitution");
        Element travel = new Element("travel");
        Element ride = new Element("ride");
        Element survival = new Element("survival");
        Element recover = new Element("recover");
        Element rank = new Element("rank");
        travel.addContent(valueOf(cons.getTravel()));
        ride.addContent(valueOf(cons.getRide()));
        survival.addContent(valueOf(cons.getSurvival()));
        recover.addContent(valueOf(cons.getRecover()));
        rank.addContent(valueOf(cons.getRank()));
        con.addContent(travel);
        con.addContent(ride);
        con.addContent(survival);
        con.addContent(recover);
        con.addContent(rank);
        return con;
    }

    protected Element dexterity(Dexterity dex) {
        Element d = new Element("Dexterity");
        Element a = new Element("acrobatics");
        Element sn = new Element("sneak");
        Element sl = new Element("sleight");
        Element p = new Element("ply");
        Element rank = new Element("rank");
        a.addContent(valueOf(dex.getAcrobatics()));
        sn.addContent(valueOf(dex.getSneak()));
        sl.addContent(valueOf(dex.getSleight()));
        p.addContent(valueOf(dex.getPly()));
        rank.addContent(valueOf(dex.getRank()));
        d.addContent(a);d.addContent(sn);d.addContent(sl);d.addContent(p);
        d.addContent(rank);
        return d;
    }

    protected Element intelligence(Intelligence intel) {
        Element a = new Element("Intelligence");
        Element b = new Element("investigate");
        Element c = new Element("gadgetry");
        Element d = new Element("knowledge");
        Element e = new Element("reason");
        Element f = new Element("rank");
        b.addContent(valueOf(intel.getInvestigate()));
        c.addContent(valueOf(intel.getGadgetry()));
        d.addContent(valueOf(intel.getKnowledge()));
        e.addContent(valueOf(intel.getReason()));
        f.addContent(valueOf(intel.getRank()));
        a.addContent(b);a.addContent(c);a.addContent(d);a.addContent(e);a.addContent(f);
        return a;
    }

    protected Element melee(Melee melee) {
        Element a = new Element("Melee");
        Element b = new Element("assault");
        Element c = new Element("rush");
        Element d = new Element("shift");
        Element e = new Element("bait");
        Element f = new Element("rank");
        b.addContent(valueOf(melee.getAssault()));
        c.addContent(valueOf(melee.getRush()));
        d.addContent(valueOf(melee.getShift()));
        e.addContent(valueOf(melee.getBait()));
        f.addContent(valueOf(melee.getRank()));
        a.addContent(b);a.addContent(c);a.addContent(d);a.addContent(e);a.addContent(f);
        return a;
    }

    protected Element ranged(Ranged ranged) {
        Element a = new Element("Ranged");
        Element b = new Element("fire");
        Element c = new Element("hamper");
        Element d = new Element("disengage");
        Element e = new Element("mark");
        Element f = new Element("rank");
        b.addContent(valueOf(ranged.getFire()));
        c.addContent(valueOf(ranged.getHamper()));
        d.addContent(valueOf(ranged.getDisengage()));
        e.addContent(valueOf(ranged.getMark()));
        f.addContent(valueOf(ranged.getRank()));
        a.addContent(b);a.addContent(c);a.addContent(d);a.addContent(e);a.addContent(f);
        return a;
    }

    protected Element strength(Strength strength) {
        Element a = new Element("Strength");
        Element b = new Element("strongarm");
        Element c = new Element("athletics");
        Element d = new Element("breakSkill");
        Element e = new Element("haul");
        Element f = new Element("rank");
        b.addContent(valueOf(strength.getStrongarm()));
        c.addContent(valueOf(strength.getAthletics()));
        d.addContent(valueOf(strength.getBreakSkill()));
        e.addContent(valueOf(strength.getHaul()));
        f.addContent(valueOf(strength.getRank()));
        a.addContent(b);a.addContent(c);a.addContent(d);a.addContent(e);a.addContent(f);
        return a;
    }

    protected Element wisdom(Wisdom wisdom) {
        Element a = new Element("Wisdom");
        Element b = new Element("survey");
        Element c = new Element("insight");
        Element d = new Element("gather");
        Element e = new Element("triage");
        Element f = new Element("rank");
        b.addContent(valueOf(wisdom.getSurvey()));
        c.addContent(valueOf(wisdom.getInsight()));
        d.addContent(valueOf(wisdom.getGather()));
        e.addContent(valueOf(wisdom.getTriage()));
        f.addContent(valueOf(wisdom.getRank()));
        a.addContent(b);a.addContent(c);a.addContent(d);a.addContent(e);a.addContent(f);
        return a;
    }
}
