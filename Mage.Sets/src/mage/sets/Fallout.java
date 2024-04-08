package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class Fallout extends ExpansionSet {

    // skip list for rad counter mechanic
    private static final List<String> unfinished = Arrays.asList("Acquired Mutation", "Bloatfly Swarm", "Contaminated Drink", "Feral Ghoul", "Glowing One", "Harold and Bob, First Numens", "Infesting Radroach", "Mariposa Military Base", "Megaton's Fate", "Mirelurk Queen", "Nightkin Ambusher", "Nuclear Fallout", "Nuka-Nuke Launcher", "Screeching Scorchbeast", "Strong, the Brutish Thespian", "Struggle for Project Purity", "Survivor's Med Kit", "Tato Farmer", "The Master, Transcendent", "The Wise Mothman", "Vault 12: The Necropolis", "Vexing Radgull");
    private static final Fallout instance = new Fallout();

    public static Fallout getInstance() {
        return instance;
    }

    private Fallout() {
        super("Fallout", "PIP", ExpansionSet.buildDate(2024, 3, 8), SetType.SUPPLEMENTAL);

        cards.add(new SetCardInfo("Abundant Growth", 194, Rarity.COMMON, mage.cards.a.AbundantGrowth.class));
        cards.add(new SetCardInfo("Agent Frank Horrigan", 89, Rarity.RARE, mage.cards.a.AgentFrankHorrigan.class));
        cards.add(new SetCardInfo("All That Glitters", 155, Rarity.COMMON, mage.cards.a.AllThatGlitters.class));
        cards.add(new SetCardInfo("Almost Perfect", 90, Rarity.RARE, mage.cards.a.AlmostPerfect.class));
        cards.add(new SetCardInfo("Alpha Deathclaw", 91, Rarity.RARE, mage.cards.a.AlphaDeathclaw.class));
        cards.add(new SetCardInfo("Anguished Unmaking", 209, Rarity.RARE, mage.cards.a.AnguishedUnmaking.class));
        cards.add(new SetCardInfo("Arcade Gannon", 92, Rarity.RARE, mage.cards.a.ArcadeGannon.class));
        cards.add(new SetCardInfo("Arcane Signet", 224, Rarity.UNCOMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Armory Paladin", 93, Rarity.RARE, mage.cards.a.ArmoryPaladin.class));
        cards.add(new SetCardInfo("Ash Barrens", 253, Rarity.COMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Assaultron Dominator", 54, Rarity.RARE, mage.cards.a.AssaultronDominator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Assaultron Dominator", 384, Rarity.RARE, mage.cards.a.AssaultronDominator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Assaultron Dominator", 582, Rarity.RARE, mage.cards.a.AssaultronDominator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Assaultron Dominator", 912, Rarity.RARE, mage.cards.a.AssaultronDominator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Assemble the Legion", 210, Rarity.RARE, mage.cards.a.AssembleTheLegion.class));
        cards.add(new SetCardInfo("Atomize", 94, Rarity.RARE, mage.cards.a.Atomize.class));
        cards.add(new SetCardInfo("Austere Command", 156, Rarity.RARE, mage.cards.a.AustereCommand.class));
        cards.add(new SetCardInfo("Automated Assembly Line", 10, Rarity.RARE, mage.cards.a.AutomatedAssemblyLine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Automated Assembly Line", 363, Rarity.RARE, mage.cards.a.AutomatedAssemblyLine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Automated Assembly Line", 538, Rarity.RARE, mage.cards.a.AutomatedAssemblyLine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Automated Assembly Line", 891, Rarity.RARE, mage.cards.a.AutomatedAssemblyLine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ayula, Queen Among Bears", 348, Rarity.RARE, mage.cards.a.AyulaQueenAmongBears.class));
        cards.add(new SetCardInfo("Basilisk Collar", 225, Rarity.RARE, mage.cards.b.BasiliskCollar.class));
        cards.add(new SetCardInfo("Bastion of Remembrance", 182, Rarity.UNCOMMON, mage.cards.b.BastionOfRemembrance.class));
        cards.add(new SetCardInfo("Battle of Hoover Dam", 11, Rarity.RARE, mage.cards.b.BattleOfHooverDam.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Battle of Hoover Dam", 364, Rarity.RARE, mage.cards.b.BattleOfHooverDam.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Battle of Hoover Dam", 539, Rarity.RARE, mage.cards.b.BattleOfHooverDam.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Battle of Hoover Dam", 892, Rarity.RARE, mage.cards.b.BattleOfHooverDam.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Behemoth Sledge", 211, Rarity.UNCOMMON, mage.cards.b.BehemothSledge.class));
        cards.add(new SetCardInfo("Behemoth of Vault 0", 127, Rarity.UNCOMMON, mage.cards.b.BehemothOfVault.class));
        cards.add(new SetCardInfo("Bighorner Rancher", 73, Rarity.UNCOMMON, mage.cards.b.BighornerRancher.class));
        cards.add(new SetCardInfo("Biomass Mutation", 212, Rarity.RARE, mage.cards.b.BiomassMutation.class));
        cards.add(new SetCardInfo("Black Market", 183, Rarity.RARE, mage.cards.b.BlackMarket.class));
        cards.add(new SetCardInfo("Blasphemous Act", 188, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Bloodforged Battle-Axe", 226, Rarity.RARE, mage.cards.b.BloodforgedBattleAxe.class));
        cards.add(new SetCardInfo("Boomer Scrapper", 95, Rarity.RARE, mage.cards.b.BoomerScrapper.class));
        cards.add(new SetCardInfo("Bottle-Cap Blast", 55, Rarity.UNCOMMON, mage.cards.b.BottleCapBlast.class));
        cards.add(new SetCardInfo("Branching Evolution", 195, Rarity.RARE, mage.cards.b.BranchingEvolution.class));
        cards.add(new SetCardInfo("Brass Knuckles", 227, Rarity.UNCOMMON, mage.cards.b.BrassKnuckles.class));
        cards.add(new SetCardInfo("Break Down", 74, Rarity.UNCOMMON, mage.cards.b.BreakDown.class));
        cards.add(new SetCardInfo("Brotherhood Outcast", 12, Rarity.UNCOMMON, mage.cards.b.BrotherhoodOutcast.class));
        cards.add(new SetCardInfo("Brotherhood Scribe", 13, Rarity.RARE, mage.cards.b.BrotherhoodScribe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brotherhood Scribe", 365, Rarity.RARE, mage.cards.b.BrotherhoodScribe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brotherhood Scribe", 541, Rarity.RARE, mage.cards.b.BrotherhoodScribe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brotherhood Scribe", 893, Rarity.RARE, mage.cards.b.BrotherhoodScribe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brotherhood Vertibird", 128, Rarity.RARE, mage.cards.b.BrotherhoodVertibird.class));
        cards.add(new SetCardInfo("Buried Ruin", 254, Rarity.UNCOMMON, mage.cards.b.BuriedRuin.class));
        cards.add(new SetCardInfo("Caesar, Legion's Emperor", 1, Rarity.MYTHIC, mage.cards.c.CaesarLegionsEmperor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Caesar, Legion's Emperor", 339, Rarity.MYTHIC, mage.cards.c.CaesarLegionsEmperor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Caesar, Legion's Emperor", 529, Rarity.MYTHIC, mage.cards.c.CaesarLegionsEmperor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Caesar, Legion's Emperor", 867, Rarity.MYTHIC, mage.cards.c.CaesarLegionsEmperor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Caesar, Legion's Emperor", 1064, Rarity.MYTHIC, mage.cards.c.CaesarLegionsEmperor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Canopy Vista", 255, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Canyon Slough", 256, Rarity.RARE, mage.cards.c.CanyonSlough.class));
        cards.add(new SetCardInfo("Captain of the Watch", 157, Rarity.RARE, mage.cards.c.CaptainOfTheWatch.class));
        cards.add(new SetCardInfo("Casualties of War", 213, Rarity.RARE, mage.cards.c.CasualtiesOfWar.class));
        cards.add(new SetCardInfo("Cathedral Acolyte", 75, Rarity.UNCOMMON, mage.cards.c.CathedralAcolyte.class));
        cards.add(new SetCardInfo("Champion's Helm", 228, Rarity.RARE, mage.cards.c.ChampionsHelm.class));
        cards.add(new SetCardInfo("Chaos Warp", 189, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Cinder Glade", 257, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Clifftop Retreat", 258, Rarity.RARE, mage.cards.c.ClifftopRetreat.class));
        cards.add(new SetCardInfo("Colonel Autumn", 98, Rarity.RARE, mage.cards.c.ColonelAutumn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Colonel Autumn", 411, Rarity.RARE, mage.cards.c.ColonelAutumn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Colonel Autumn", 626, Rarity.RARE, mage.cards.c.ColonelAutumn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Colonel Autumn", 939, Rarity.RARE, mage.cards.c.ColonelAutumn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Command Tower", 259, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander Sofia Daguerre", 15, Rarity.UNCOMMON, mage.cards.c.CommanderSofiaDaguerre.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Commander Sofia Daguerre", 543, Rarity.UNCOMMON, mage.cards.c.CommanderSofiaDaguerre.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Contagion Clasp", 229, Rarity.UNCOMMON, mage.cards.c.ContagionClasp.class));
        cards.add(new SetCardInfo("Corpsejack Menace", 214, Rarity.UNCOMMON, mage.cards.c.CorpsejackMenace.class));
        cards.add(new SetCardInfo("Crimson Caravaneer", 56, Rarity.UNCOMMON, mage.cards.c.CrimsonCaravaneer.class));
        cards.add(new SetCardInfo("Crucible of Worlds", 357, Rarity.MYTHIC, mage.cards.c.CrucibleOfWorlds.class));
        cards.add(new SetCardInfo("Crush Contraband", 158, Rarity.UNCOMMON, mage.cards.c.CrushContraband.class));
        cards.add(new SetCardInfo("Cultivate", 196, Rarity.UNCOMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 260, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Deadly Dispute", 184, Rarity.COMMON, mage.cards.d.DeadlyDispute.class));
        cards.add(new SetCardInfo("Desolate Mire", 146, Rarity.RARE, mage.cards.d.DesolateMire.class));
        cards.add(new SetCardInfo("Dispatch", 159, Rarity.UNCOMMON, mage.cards.d.Dispatch.class));
        cards.add(new SetCardInfo("Dr. Madison Li", 3, Rarity.MYTHIC, mage.cards.d.DrMadisonLi.class));
        cards.add(new SetCardInfo("Dragonskull Summit", 261, Rarity.RARE, mage.cards.d.DragonskullSummit.class));
        cards.add(new SetCardInfo("Drowned Catacomb", 262, Rarity.RARE, mage.cards.d.DrownedCatacomb.class));
        cards.add(new SetCardInfo("Elder Owyn Lyons", 103, Rarity.UNCOMMON, mage.cards.e.ElderOwynLyons.class));
        cards.add(new SetCardInfo("Electrosiphon", 104, Rarity.RARE, mage.cards.e.Electrosiphon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Electrosiphon", 414, Rarity.RARE, mage.cards.e.Electrosiphon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Electrosiphon", 632, Rarity.RARE, mage.cards.e.Electrosiphon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Electrosiphon", 942, Rarity.RARE, mage.cards.e.Electrosiphon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Entrapment Maneuver", 160, Rarity.RARE, mage.cards.e.EntrapmentManeuver.class));
        cards.add(new SetCardInfo("Everflowing Chalice", 230, Rarity.UNCOMMON, mage.cards.e.EverflowingChalice.class));
        cards.add(new SetCardInfo("Evolving Wilds", 263, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 264, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Expert-Level Safe", 133, Rarity.UNCOMMON, mage.cards.e.ExpertLevelSafe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Expert-Level Safe", 661, Rarity.UNCOMMON, mage.cards.e.ExpertLevelSafe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Explorer's Scope", 231, Rarity.COMMON, mage.cards.e.ExplorersScope.class));
        cards.add(new SetCardInfo("Farewell", 353, Rarity.RARE, mage.cards.f.Farewell.class));
        cards.add(new SetCardInfo("Farseek", 197, Rarity.COMMON, mage.cards.f.Farseek.class));
        cards.add(new SetCardInfo("Ferrous Lake", 148, Rarity.RARE, mage.cards.f.FerrousLake.class));
        cards.add(new SetCardInfo("Fertile Ground", 198, Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Fervent Charge", 215, Rarity.RARE, mage.cards.f.FerventCharge.class));
        cards.add(new SetCardInfo("Fetid Pools", 265, Rarity.RARE, mage.cards.f.FetidPools.class));
        cards.add(new SetCardInfo("Find // Finality", 216, Rarity.RARE, mage.cards.f.FindFinality.class));
        cards.add(new SetCardInfo("Fireshrieker", 232, Rarity.UNCOMMON, mage.cards.f.Fireshrieker.class));
        cards.add(new SetCardInfo("Forest", 325, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Fraying Sanity", 175, Rarity.RARE, mage.cards.f.FrayingSanity.class));
        cards.add(new SetCardInfo("Gary Clone", 16, Rarity.UNCOMMON, mage.cards.g.GaryClone.class));
//        cards.add(new SetCardInfo("Gemrazer", 351, Rarity.RARE, mage.cards.g.Gemrazer.class));
        cards.add(new SetCardInfo("General's Enforcer", 217, Rarity.UNCOMMON, mage.cards.g.GeneralsEnforcer.class));
        cards.add(new SetCardInfo("Glacial Fortress", 266, Rarity.RARE, mage.cards.g.GlacialFortress.class));
        cards.add(new SetCardInfo("Glimmer of Genius", 176, Rarity.UNCOMMON, mage.cards.g.GlimmerOfGenius.class));
        cards.add(new SetCardInfo("Grave Titan", 346, Rarity.MYTHIC, mage.cards.g.GraveTitan.class));
        cards.add(new SetCardInfo("Guardian Project", 199, Rarity.RARE, mage.cards.g.GuardianProject.class));
        cards.add(new SetCardInfo("Gunner Conscript", 77, Rarity.UNCOMMON, mage.cards.g.GunnerConscript.class));
        cards.add(new SetCardInfo("Hancock, Ghoulish Mayor", 45, Rarity.RARE, mage.cards.h.HancockGhoulishMayor.class));
        cards.add(new SetCardInfo("Hardened Scales", 200, Rarity.RARE, mage.cards.h.HardenedScales.class));
        cards.add(new SetCardInfo("Harmonize", 201, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Heroic Intervention", 202, Rarity.RARE, mage.cards.h.HeroicIntervention.class));
        cards.add(new SetCardInfo("Heroic Reinforcements", 218, Rarity.UNCOMMON, mage.cards.h.HeroicReinforcements.class));
        cards.add(new SetCardInfo("Hinterland Harbor", 267, Rarity.RARE, mage.cards.h.HinterlandHarbor.class));
        cards.add(new SetCardInfo("Hornet Queen", 350, Rarity.RARE, mage.cards.h.HornetQueen.class));
        cards.add(new SetCardInfo("Hour of Reckoning", 161, Rarity.RARE, mage.cards.h.HourOfReckoning.class));
        cards.add(new SetCardInfo("Hullbreaker Horror", 344, Rarity.RARE, mage.cards.h.HullbreakerHorror.class));
        cards.add(new SetCardInfo("Ian the Reckless", 59, Rarity.UNCOMMON, mage.cards.i.IanTheReckless.class));
        cards.add(new SetCardInfo("Impassioned Orator", 162, Rarity.COMMON, mage.cards.i.ImpassionedOrator.class));
        cards.add(new SetCardInfo("Inexorable Tide", 177, Rarity.RARE, mage.cards.i.InexorableTide.class));
        cards.add(new SetCardInfo("Inspiring Call", 203, Rarity.UNCOMMON, mage.cards.i.InspiringCall.class));
        cards.add(new SetCardInfo("Intangible Virtue", 163, Rarity.UNCOMMON, mage.cards.i.IntangibleVirtue.class));
        cards.add(new SetCardInfo("Intelligence Bobblehead", 134, Rarity.UNCOMMON, mage.cards.i.IntelligenceBobblehead.class));
        cards.add(new SetCardInfo("Irrigated Farmland", 268, Rarity.RARE, mage.cards.i.IrrigatedFarmland.class));
        cards.add(new SetCardInfo("Island", 319, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Isolated Chapel", 269, Rarity.RARE, mage.cards.i.IsolatedChapel.class));
        cards.add(new SetCardInfo("Jungle Shrine", 270, Rarity.UNCOMMON, mage.cards.j.JungleShrine.class));
        cards.add(new SetCardInfo("Junktown", 150, Rarity.RARE, mage.cards.j.Junktown.class));
        cards.add(new SetCardInfo("Keeper of the Accord", 164, Rarity.RARE, mage.cards.k.KeeperOfTheAccord.class));
        cards.add(new SetCardInfo("Kellogg, Dangerous Mind", 106, Rarity.RARE, mage.cards.k.KelloggDangerousMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kellogg, Dangerous Mind", 415, Rarity.RARE, mage.cards.k.KelloggDangerousMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kellogg, Dangerous Mind", 634, Rarity.RARE, mage.cards.k.KelloggDangerousMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kellogg, Dangerous Mind", 943, Rarity.RARE, mage.cards.k.KelloggDangerousMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Legate Lanius, Caesar's Ace", 107, Rarity.UNCOMMON, mage.cards.l.LegateLaniusCaesarsAce.class));
        cards.add(new SetCardInfo("Lethal Scheme", 185, Rarity.RARE, mage.cards.l.LethalScheme.class));
        cards.add(new SetCardInfo("Liberty Prime, Recharged", 5, Rarity.MYTHIC, mage.cards.l.LibertyPrimeRecharged.class));
        cards.add(new SetCardInfo("Lightning Greaves", 233, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Lily Bowen, Raging Grandma", 79, Rarity.RARE, mage.cards.l.LilyBowenRagingGrandma.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lily Bowen, Raging Grandma", 399, Rarity.RARE, mage.cards.l.LilyBowenRagingGrandma.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lily Bowen, Raging Grandma", 607, Rarity.RARE, mage.cards.l.LilyBowenRagingGrandma.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lily Bowen, Raging Grandma", 927, Rarity.RARE, mage.cards.l.LilyBowenRagingGrandma.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lord of the Undead", 345, Rarity.RARE, mage.cards.l.LordOfTheUndead.class));
        cards.add(new SetCardInfo("Loyal Apprentice", 190, Rarity.UNCOMMON, mage.cards.l.LoyalApprentice.class));
        cards.add(new SetCardInfo("MacCready, Lamplight Mayor", 108, Rarity.RARE, mage.cards.m.MacCreadyLamplightMayor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("MacCready, Lamplight Mayor", 417, Rarity.RARE, mage.cards.m.MacCreadyLamplightMayor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("MacCready, Lamplight Mayor", 636, Rarity.RARE, mage.cards.m.MacCreadyLamplightMayor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("MacCready, Lamplight Mayor", 945, Rarity.RARE, mage.cards.m.MacCreadyLamplightMayor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mantle of the Ancients", 165, Rarity.RARE, mage.cards.m.MantleOfTheAncients.class));
        cards.add(new SetCardInfo("Marshal's Anthem", 166, Rarity.RARE, mage.cards.m.MarshalsAnthem.class));
        cards.add(new SetCardInfo("Martial Coup", 167, Rarity.RARE, mage.cards.m.MartialCoup.class));
        cards.add(new SetCardInfo("Masterwork of Ingenuity", 234, Rarity.RARE, mage.cards.m.MasterworkOfIngenuity.class));
        cards.add(new SetCardInfo("Mechanized Production", 178, Rarity.MYTHIC, mage.cards.m.MechanizedProduction.class));
        cards.add(new SetCardInfo("Megaton's Fate", 61, Rarity.RARE, mage.cards.m.MegatonsFate.class));
        cards.add(new SetCardInfo("Memorial to Glory", 271, Rarity.UNCOMMON, mage.cards.m.MemorialToGlory.class));
        cards.add(new SetCardInfo("Mind Stone", 235, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mirelurk Queen", 33, Rarity.RARE, mage.cards.m.MirelurkQueen.class));
        cards.add(new SetCardInfo("Mister Gutsy", 136, Rarity.RARE, mage.cards.m.MisterGutsy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mister Gutsy", 433, Rarity.RARE, mage.cards.m.MisterGutsy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mister Gutsy", 664, Rarity.RARE, mage.cards.m.MisterGutsy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mister Gutsy", 961, Rarity.RARE, mage.cards.m.MisterGutsy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Morbid Opportunist", 186, Rarity.UNCOMMON, mage.cards.m.MorbidOpportunist.class));
        cards.add(new SetCardInfo("Mortuary Mire", 272, Rarity.COMMON, mage.cards.m.MortuaryMire.class));
        cards.add(new SetCardInfo("Mossfire Valley", 273, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mountain", 323, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mr. House, President and CEO", 7, Rarity.MYTHIC, mage.cards.m.MrHousePresidentAndCEO.class));
        cards.add(new SetCardInfo("Myriad Landscape", 274, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Mystic Forge", 236, Rarity.RARE, mage.cards.m.MysticForge.class));
        cards.add(new SetCardInfo("Mystic Monastery", 275, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Nerd Rage", 34, Rarity.UNCOMMON, mage.cards.n.NerdRage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nerd Rage", 562, Rarity.UNCOMMON, mage.cards.n.NerdRage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nesting Grounds", 276, Rarity.RARE, mage.cards.n.NestingGrounds.class));
        cards.add(new SetCardInfo("Nick Valentine, Private Eye", 35, Rarity.RARE, mage.cards.n.NickValentinePrivateEye.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nick Valentine, Private Eye", 378, Rarity.RARE, mage.cards.n.NickValentinePrivateEye.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nick Valentine, Private Eye", 563, Rarity.RARE, mage.cards.n.NickValentinePrivateEye.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nick Valentine, Private Eye", 906, Rarity.RARE, mage.cards.n.NickValentinePrivateEye.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nomad Outpost", 277, Rarity.UNCOMMON, mage.cards.n.NomadOutpost.class));
        cards.add(new SetCardInfo("Nuka-Cola Vending Machine", 137, Rarity.UNCOMMON, mage.cards.n.NukaColaVendingMachine.class));
        cards.add(new SetCardInfo("One with the Machine", 179, Rarity.RARE, mage.cards.o.OneWithTheMachine.class));
        cards.add(new SetCardInfo("Open the Vaults", 168, Rarity.RARE, mage.cards.o.OpenTheVaults.class));
        cards.add(new SetCardInfo("Opulent Palace", 278, Rarity.UNCOMMON, mage.cards.o.OpulentPalace.class));
        cards.add(new SetCardInfo("Overflowing Basin", 152, Rarity.RARE, mage.cards.o.OverflowingBasin.class));
        cards.add(new SetCardInfo("Overseer of Vault 76", 19, Rarity.RARE, mage.cards.o.OverseerOfVault76.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Overseer of Vault 76", 368, Rarity.RARE, mage.cards.o.OverseerOfVault76.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Overseer of Vault 76", 547, Rarity.RARE, mage.cards.o.OverseerOfVault76.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Overseer of Vault 76", 896, Rarity.RARE, mage.cards.o.OverseerOfVault76.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Paladin Danse, Steel Maverick", 20, Rarity.UNCOMMON, mage.cards.p.PaladinDanseSteelMaverick.class));
        cards.add(new SetCardInfo("Panharmonicon", 237, Rarity.RARE, mage.cards.p.Panharmonicon.class));
        cards.add(new SetCardInfo("Path of Ancestry", 279, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Path to Exile", 169, Rarity.UNCOMMON, mage.cards.p.PathToExile.class));
        cards.add(new SetCardInfo("Pip-Boy 3000", 140, Rarity.RARE, mage.cards.p.PipBoy3000.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pip-Boy 3000", 435, Rarity.RARE, mage.cards.p.PipBoy3000.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pip-Boy 3000", 668, Rarity.RARE, mage.cards.p.PipBoy3000.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pip-Boy 3000", 963, Rarity.RARE, mage.cards.p.PipBoy3000.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Piper Wright, Publick Reporter", 36, Rarity.RARE, mage.cards.p.PiperWrightPublickReporter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Piper Wright, Publick Reporter", 379, Rarity.RARE, mage.cards.p.PiperWrightPublickReporter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Piper Wright, Publick Reporter", 564, Rarity.RARE, mage.cards.p.PiperWrightPublickReporter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Piper Wright, Publick Reporter", 907, Rarity.RARE, mage.cards.p.PiperWrightPublickReporter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pitiless Plunderer", 187, Rarity.UNCOMMON, mage.cards.p.PitilessPlunderer.class));
        cards.add(new SetCardInfo("Plains", 317, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Powder Ganger", 65, Rarity.RARE, mage.cards.p.PowderGanger.class));
        cards.add(new SetCardInfo("Prairie Stream", 280, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Pre-War Formalwear", 21, Rarity.RARE, mage.cards.p.PreWarFormalwear.class));
        cards.add(new SetCardInfo("Puresteel Paladin", 170, Rarity.RARE, mage.cards.p.PuresteelPaladin.class));
        cards.add(new SetCardInfo("Putrefy", 219, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Radstorm", 37, Rarity.RARE, mage.cards.r.Radstorm.class));
        cards.add(new SetCardInfo("Rampant Growth", 204, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Rancor", 205, Rarity.UNCOMMON, mage.cards.r.Rancor.class));
        cards.add(new SetCardInfo("Ravages of War", 354, Rarity.MYTHIC, mage.cards.r.RavagesOfWar.class));
        cards.add(new SetCardInfo("Razortide Bridge", 281, Rarity.COMMON, mage.cards.r.RazortideBridge.class));
        cards.add(new SetCardInfo("Red Death, Shipwrecker", 116, Rarity.RARE, mage.cards.r.RedDeathShipwrecker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Red Death, Shipwrecker", 426, Rarity.RARE, mage.cards.r.RedDeathShipwrecker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Red Death, Shipwrecker", 644, Rarity.RARE, mage.cards.r.RedDeathShipwrecker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Red Death, Shipwrecker", 954, Rarity.RARE, mage.cards.r.RedDeathShipwrecker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Roadside Reliquary", 282, Rarity.UNCOMMON, mage.cards.r.RoadsideReliquary.class));
        cards.add(new SetCardInfo("Robobrain War Mind", 38, Rarity.UNCOMMON, mage.cards.r.RobobrainWarMind.class));
        cards.add(new SetCardInfo("Rogue's Passage", 283, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Rootbound Crag", 284, Rarity.RARE, mage.cards.r.RootboundCrag.class));
        cards.add(new SetCardInfo("Ruinous Ultimatum", 220, Rarity.RARE, mage.cards.r.RuinousUltimatum.class));
        cards.add(new SetCardInfo("Rustvale Bridge", 285, Rarity.COMMON, mage.cards.r.RustvaleBridge.class));
        cards.add(new SetCardInfo("Ruthless Radrat", 48, Rarity.UNCOMMON, mage.cards.r.RuthlessRadrat.class));
        cards.add(new SetCardInfo("Scattered Groves", 286, Rarity.RARE, mage.cards.s.ScatteredGroves.class));
        cards.add(new SetCardInfo("Scavenger Grounds", 287, Rarity.RARE, mage.cards.s.ScavengerGrounds.class));
        cards.add(new SetCardInfo("Secure the Wastes", 171, Rarity.RARE, mage.cards.s.SecureTheWastes.class));
        cards.add(new SetCardInfo("Securitron Squadron", 23, Rarity.RARE, mage.cards.s.SecuritronSquadron.class));
        cards.add(new SetCardInfo("Sentry Bot", 24, Rarity.RARE, mage.cards.s.SentryBot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sentry Bot", 371, Rarity.RARE, mage.cards.s.SentryBot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sentry Bot", 552, Rarity.RARE, mage.cards.s.SentryBot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sentry Bot", 899, Rarity.RARE, mage.cards.s.SentryBot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Shadowblood Ridge", 288, Rarity.RARE, mage.cards.s.ShadowbloodRidge.class));
        cards.add(new SetCardInfo("Sheltered Thicket", 289, Rarity.RARE, mage.cards.s.ShelteredThicket.class));
        cards.add(new SetCardInfo("Sierra, Nuka's Biggest Fan", 25, Rarity.RARE, mage.cards.s.SierraNukasBiggestFan.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sierra, Nuka's Biggest Fan", 372, Rarity.RARE, mage.cards.s.SierraNukasBiggestFan.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sierra, Nuka's Biggest Fan", 553, Rarity.RARE, mage.cards.s.SierraNukasBiggestFan.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sierra, Nuka's Biggest Fan", 900, Rarity.RARE, mage.cards.s.SierraNukasBiggestFan.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Silver Shroud Costume", 142, Rarity.UNCOMMON, mage.cards.s.SilverShroudCostume.class));
        cards.add(new SetCardInfo("Silverbluff Bridge", 290, Rarity.COMMON, mage.cards.s.SilverbluffBridge.class));
        cards.add(new SetCardInfo("Single Combat", 172, Rarity.RARE, mage.cards.s.SingleCombat.class));
        cards.add(new SetCardInfo("Skullclamp", 238, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Skycloud Expanse", 291, Rarity.RARE, mage.cards.s.SkycloudExpanse.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 292, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Sol Ring", 239, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 240, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Spire of Industry", 293, Rarity.RARE, mage.cards.s.SpireOfIndustry.class));
        cards.add(new SetCardInfo("Squirrel Nest", 206, Rarity.UNCOMMON, mage.cards.s.SquirrelNest.class));
        cards.add(new SetCardInfo("Steel Overseer", 241, Rarity.RARE, mage.cards.s.SteelOverseer.class));
        cards.add(new SetCardInfo("Sticky Fingers", 191, Rarity.COMMON, mage.cards.s.StickyFingers.class));
        cards.add(new SetCardInfo("Stolen Strategy", 192, Rarity.RARE, mage.cards.s.StolenStrategy.class));
        cards.add(new SetCardInfo("Sulfur Falls", 294, Rarity.RARE, mage.cards.s.SulfurFalls.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 295, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunken Hollow", 296, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Sunpetal Grove", 297, Rarity.RARE, mage.cards.s.SunpetalGrove.class));
        cards.add(new SetCardInfo("Sunscorched Divide", 153, Rarity.RARE, mage.cards.s.SunscorchedDivide.class));
        cards.add(new SetCardInfo("Super Mutant Scavenger", 85, Rarity.UNCOMMON, mage.cards.s.SuperMutantScavenger.class));
        cards.add(new SetCardInfo("Swamp", 321, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swiftfoot Boots", 242, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 173, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("T-45 Power Armor", 145, Rarity.RARE, mage.cards.t.T45PowerArmor.class));
        cards.add(new SetCardInfo("Tainted Field", 298, Rarity.UNCOMMON, mage.cards.t.TaintedField.class));
        cards.add(new SetCardInfo("Tainted Isle", 299, Rarity.UNCOMMON, mage.cards.t.TaintedIsle.class));
        cards.add(new SetCardInfo("Tainted Peak", 300, Rarity.UNCOMMON, mage.cards.t.TaintedPeak.class));
        cards.add(new SetCardInfo("Tainted Wood", 301, Rarity.UNCOMMON, mage.cards.t.TaintedWood.class));
        cards.add(new SetCardInfo("Talisman of Conviction", 243, Rarity.UNCOMMON, mage.cards.t.TalismanOfConviction.class));
        cards.add(new SetCardInfo("Talisman of Creativity", 244, Rarity.UNCOMMON, mage.cards.t.TalismanOfCreativity.class));
        cards.add(new SetCardInfo("Talisman of Curiosity", 245, Rarity.UNCOMMON, mage.cards.t.TalismanOfCuriosity.class));
        cards.add(new SetCardInfo("Talisman of Dominance", 246, Rarity.UNCOMMON, mage.cards.t.TalismanOfDominance.class));
        cards.add(new SetCardInfo("Talisman of Hierarchy", 247, Rarity.UNCOMMON, mage.cards.t.TalismanOfHierarchy.class));
        cards.add(new SetCardInfo("Talisman of Indulgence", 248, Rarity.UNCOMMON, mage.cards.t.TalismanOfIndulgence.class));
        cards.add(new SetCardInfo("Talisman of Progress", 249, Rarity.UNCOMMON, mage.cards.t.TalismanOfProgress.class));
        cards.add(new SetCardInfo("Talisman of Resilience", 250, Rarity.UNCOMMON, mage.cards.t.TalismanOfResilience.class));
        cards.add(new SetCardInfo("Tarmogoyf", 349, Rarity.MYTHIC, mage.cards.t.Tarmogoyf.class));
        cards.add(new SetCardInfo("Temple of Abandon", 302, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Deceit", 303, Rarity.RARE, mage.cards.t.TempleOfDeceit.class));
        cards.add(new SetCardInfo("Temple of Enlightenment", 304, Rarity.RARE, mage.cards.t.TempleOfEnlightenment.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 305, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Malady", 306, Rarity.RARE, mage.cards.t.TempleOfMalady.class));
        cards.add(new SetCardInfo("Temple of Malice", 307, Rarity.RARE, mage.cards.t.TempleOfMalice.class));
        cards.add(new SetCardInfo("Temple of Mystery", 308, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Plenty", 309, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Temple of Silence", 310, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 312, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Temple of the False God", 311, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 313, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("The Wise Mothman", 4, Rarity.MYTHIC, mage.cards.t.TheWiseMothman.class));
        cards.add(new SetCardInfo("Thirst for Knowledge", 180, Rarity.UNCOMMON, mage.cards.t.ThirstForKnowledge.class));
        cards.add(new SetCardInfo("Thought Vessel", 251, Rarity.COMMON, mage.cards.t.ThoughtVessel.class));
        cards.add(new SetCardInfo("Tireless Tracker", 207, Rarity.RARE, mage.cards.t.TirelessTracker.class));
        cards.add(new SetCardInfo("Treasure Vault", 314, Rarity.RARE, mage.cards.t.TreasureVault.class));
        cards.add(new SetCardInfo("Unexpected Windfall", 193, Rarity.COMMON, mage.cards.u.UnexpectedWindfall.class));
        cards.add(new SetCardInfo("V.A.T.S.", 50, Rarity.RARE, mage.cards.v.VATS.class));
        cards.add(new SetCardInfo("Valorous Stance", 174, Rarity.UNCOMMON, mage.cards.v.ValorousStance.class));
        cards.add(new SetCardInfo("Vandalblast", 355, Rarity.UNCOMMON, mage.cards.v.Vandalblast.class));
        cards.add(new SetCardInfo("Vault 101: Birthday Party", 28, Rarity.RARE, mage.cards.v.Vault101BirthdayParty.class));
        cards.add(new SetCardInfo("Vault 75: Middle School", 27, Rarity.RARE, mage.cards.v.Vault75MiddleSchool.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vault 75: Middle School", 555, Rarity.RARE, mage.cards.v.Vault75MiddleSchool.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vigor", 347, Rarity.RARE, mage.cards.v.Vigor.class));
        cards.add(new SetCardInfo("Viridescent Bog", 154, Rarity.RARE, mage.cards.v.ViridescentBog.class));
        cards.add(new SetCardInfo("Wake the Past", 221, Rarity.RARE, mage.cards.w.WakeThePast.class));
        cards.add(new SetCardInfo("Walking Ballista", 352, Rarity.RARE, mage.cards.w.WalkingBallista.class));
        cards.add(new SetCardInfo("War Room", 1068, Rarity.RARE, mage.cards.w.WarRoom.class));
        cards.add(new SetCardInfo("Wasteland", 361, Rarity.RARE, mage.cards.w.Wasteland.class));
        cards.add(new SetCardInfo("Watchful Radstag", 87, Rarity.RARE, mage.cards.w.WatchfulRadstag.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 252, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Wear // Tear", 222, Rarity.UNCOMMON, mage.cards.w.WearTear.class));
        cards.add(new SetCardInfo("Well Rested", 88, Rarity.UNCOMMON, mage.cards.w.WellRested.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Well Rested", 616, Rarity.UNCOMMON, mage.cards.w.WellRested.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Whirler Rogue", 181, Rarity.UNCOMMON, mage.cards.w.WhirlerRogue.class));
        cards.add(new SetCardInfo("Wild Growth", 208, Rarity.COMMON, mage.cards.w.WildGrowth.class));
        cards.add(new SetCardInfo("Windbrisk Heights", 315, Rarity.RARE, mage.cards.w.WindbriskHeights.class));
        cards.add(new SetCardInfo("Winding Constrictor", 223, Rarity.UNCOMMON, mage.cards.w.WindingConstrictor.class));
        cards.add(new SetCardInfo("Woodland Cemetery", 316, Rarity.RARE, mage.cards.w.WoodlandCemetery.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is implemented
    }
}
