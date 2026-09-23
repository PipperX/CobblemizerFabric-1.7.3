package git.dragomordor.cobblemizer.fabric.item;

import com.cobblemon.mod.common.api.pokeball.PokeBalls;
import com.cobblemon.mod.common.api.pokemon.Natures;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import git.dragomordor.cobblemizer.fabric.CobblemizerMod;
import git.dragomordor.cobblemizer.fabric.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CobblemizerItems {

    // IV, EV, and Level Randomizers
    public static final IVMaxerItem ALL_IV_MAXER = registerItem("all_iv_maxer", new IVMaxerItem());
    public static final IVRandomItem IV_RANDOM = registerItem("iv_random", new IVRandomItem());
    public static final EVRandomItem EV_RANDOM = registerItem("ev_random", new EVRandomItem());
    public static final LVLRandomItem LVL_RANDOM = registerItem("level_random", new LVLRandomItem());

    // Swappers
    public static final GenderSwapItem GENDER_SWAPPER = registerItem("gender_swapper", new GenderSwapItem());
    public static final ShinySwapItem SHINY_SWAPPER = registerItem("shiny_swapper", new ShinySwapItem());

    // CaughtBallChangerItems
    public static final CaughtBallChangerItem AZURE_BALL_CB_CHANGER = registerItem("azure_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getAzureBall()));
    public static final CaughtBallChangerItem BEAST_BALL_CB_CHANGER = registerItem("beast_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getBeastBall()));
    public static final CaughtBallChangerItem CHERISH_BALL_CB_CHANGER = registerItem("cherish_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getCherishBall()));
    public static final CaughtBallChangerItem CITRINE_BALL_CB_CHANGER = registerItem("citrine_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getCitrineBall()));
    public static final CaughtBallChangerItem DIVE_BALL_CB_CHANGER = registerItem("dive_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getDiveBall()));
    public static final CaughtBallChangerItem DREAM_BALL_CB_CHANGER = registerItem("dream_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getDreamBall()));
    public static final CaughtBallChangerItem DUSK_BALL_CB_CHANGER = registerItem("dusk_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getDuskBall()));
    public static final CaughtBallChangerItem FAST_BALL_CB_CHANGER = registerItem("fast_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getFastBall()));
    public static final CaughtBallChangerItem FRIEND_BALL_CB_CHANGER = registerItem("friend_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getFriendBall()));
    public static final CaughtBallChangerItem GREAT_BALL_CB_CHANGER = registerItem("great_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getGreatBall()));
    public static final CaughtBallChangerItem HEAL_BALL_CB_CHANGER = registerItem("heal_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getHealBall()));
    public static final CaughtBallChangerItem HEAVY_BALL_CB_CHANGER = registerItem("heavy_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getHeavyBall()));
    public static final CaughtBallChangerItem LEVEL_BALL_CB_CHANGER = registerItem("level_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getLevelBall()));
    public static final CaughtBallChangerItem LOVE_BALL_CB_CHANGER = registerItem("love_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getLoveBall()));
    public static final CaughtBallChangerItem LURE_BALL_CB_CHANGER = registerItem("lure_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getLureBall()));
    public static final CaughtBallChangerItem LUXURY_BALL_CB_CHANGER = registerItem("luxury_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getLuxuryBall()));
    public static final CaughtBallChangerItem MASTER_BALL_CB_CHANGER = registerItem("master_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getMasterBall()));
    public static final CaughtBallChangerItem MOON_BALL_CB_CHANGER = registerItem("moon_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getMoonBall()));
    public static final CaughtBallChangerItem NEST_BALL_CB_CHANGER = registerItem("nest_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getNestBall()));
    public static final CaughtBallChangerItem NET_BALL_CB_CHANGER = registerItem("net_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getNetBall()));
    public static final CaughtBallChangerItem PARK_BALL_CB_CHANGER = registerItem("park_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getParkBall()));
    public static final CaughtBallChangerItem POKE_BALL_CB_CHANGER = registerItem("poke_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getPokeBall()));
    public static final CaughtBallChangerItem PREMIER_BALL_CB_CHANGER = registerItem("premier_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getPremierBall()));
    public static final CaughtBallChangerItem REPEAT_BALL_CB_CHANGER = registerItem("repeat_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getRepeatBall()));
    public static final CaughtBallChangerItem ROSEATE_BALL_CB_CHANGER = registerItem("roseate_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getRoseateBall()));
    public static final CaughtBallChangerItem SAFARI_BALL_CB_CHANGER = registerItem("safari_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getSafariBall()));
    public static final CaughtBallChangerItem SLATE_BALL_CB_CHANGER = registerItem("slate_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getSlateBall()));
    public static final CaughtBallChangerItem SPORT_BALL_CB_CHANGER = registerItem("sport_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getSportBall()));
    public static final CaughtBallChangerItem TIMER_BALL_CB_CHANGER = registerItem("timer_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getTimerBall()));
    public static final CaughtBallChangerItem ULTRA_BALL_CB_CHANGER = registerItem("ultra_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getUltraBall()));
    public static final CaughtBallChangerItem VERDANT_BALL_CB_CHANGER = registerItem("verdant_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.getVerdantBall()));

    // FriendshipAddItems
    public static final FriendshipAddItem FRIENDSHIP_ADD_COMMON = registerItem("friendship_add_common", new FriendshipAddItem("COMMON"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_UNCOMMON = registerItem("friendship_add_uncommon", new FriendshipAddItem("UNCOMMON"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_RARE = registerItem("friendship_add_rare", new FriendshipAddItem("RARE"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_EPIC = registerItem("friendship_add_epic", new FriendshipAddItem("EPIC"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_LEGENDARY = registerItem("friendship_add_legendary", new FriendshipAddItem("LEGENDARY"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_MAX = registerItem("friendship_add_max", new FriendshipAddItem("MAX"));

    // EVAddItems
    public static final EVAddItem EV_ADD_SP_DEF_COMMON = registerItem("ev_add_sp_def_common", new EVAddItem("COMMON", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_UNCOMMON = registerItem("ev_add_sp_def_uncommon", new EVAddItem("UNCOMMON", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_RARE = registerItem("ev_add_sp_def_rare", new EVAddItem("RARE", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_EPIC = registerItem("ev_add_sp_def_epic", new EVAddItem("EPIC", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_LEGENDARY = registerItem("ev_add_sp_def_legendary", new EVAddItem("LEGENDARY", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_MAX = registerItem("ev_add_sp_def_max", new EVAddItem("MAX", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_ATK_COMMON = registerItem("ev_add_sp_atk_common", new EVAddItem("COMMON", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_UNCOMMON = registerItem("ev_add_sp_atk_uncommon", new EVAddItem("UNCOMMON", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_RARE = registerItem("ev_add_sp_atk_rare", new EVAddItem("RARE", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_EPIC = registerItem("ev_add_sp_atk_epic", new EVAddItem("EPIC", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_LEGENDARY = registerItem("ev_add_sp_atk_legendary", new EVAddItem("LEGENDARY", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_MAX = registerItem("ev_add_sp_atk_max", new EVAddItem("MAX", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SPEED_COMMON = registerItem("ev_add_speed_common", new EVAddItem("COMMON", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_UNCOMMON = registerItem("ev_add_speed_uncommon", new EVAddItem("UNCOMMON", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_RARE = registerItem("ev_add_speed_rare", new EVAddItem("RARE", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_EPIC = registerItem("ev_add_speed_epic", new EVAddItem("EPIC", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_LEGENDARY = registerItem("ev_add_speed_legendary", new EVAddItem("LEGENDARY", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_MAX = registerItem("ev_add_speed_max", new EVAddItem("MAX", Stats.SPEED));
    public static final EVAddItem EV_ADD_ATK_COMMON = registerItem("ev_add_atk_common", new EVAddItem("COMMON", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_UNCOMMON = registerItem("ev_add_atk_uncommon", new EVAddItem("UNCOMMON", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_RARE = registerItem("ev_add_atk_rare", new EVAddItem("RARE", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_EPIC = registerItem("ev_add_atk_epic", new EVAddItem("EPIC", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_LEGENDARY = registerItem("ev_add_atk_legendary", new EVAddItem("LEGENDARY", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_MAX = registerItem("ev_add_atk_max", new EVAddItem("MAX", Stats.ATTACK));
    public static final EVAddItem EV_ADD_DEF_COMMON = registerItem("ev_add_def_common", new EVAddItem("COMMON", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_UNCOMMON = registerItem("ev_add_def_uncommon", new EVAddItem("UNCOMMON", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_RARE = registerItem("ev_add_def_rare", new EVAddItem("RARE", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_EPIC = registerItem("ev_add_def_epic", new EVAddItem("EPIC", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_LEGENDARY = registerItem("ev_add_def_legendary", new EVAddItem("LEGENDARY", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_MAX = registerItem("ev_add_def_max", new EVAddItem("MAX", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_HP_COMMON = registerItem("ev_add_hp_common", new EVAddItem("COMMON", Stats.HP));
    public static final EVAddItem EV_ADD_HP_UNCOMMON = registerItem("ev_add_hp_uncommon", new EVAddItem("UNCOMMON", Stats.HP));
    public static final EVAddItem EV_ADD_HP_RARE = registerItem("ev_add_hp_rare", new EVAddItem("RARE", Stats.HP));
    public static final EVAddItem EV_ADD_HP_EPIC = registerItem("ev_add_hp_epic", new EVAddItem("EPIC", Stats.HP));
    public static final EVAddItem EV_ADD_HP_LEGENDARY = registerItem("ev_add_hp_legendary", new EVAddItem("LEGENDARY", Stats.HP));
    public static final EVAddItem EV_ADD_HP_MAX = registerItem("ev_add_hp_max", new EVAddItem("MAX", Stats.HP));

    // IVAddItems
    public static final IVAddItem IV_ADD_SP_DEF_COMMON = registerItem("iv_add_sp_def_common", new IVAddItem("COMMON", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_UNCOMMON = registerItem("iv_add_sp_def_uncommon", new IVAddItem("UNCOMMON", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_RARE = registerItem("iv_add_sp_def_rare", new IVAddItem("RARE", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_EPIC = registerItem("iv_add_sp_def_epic", new IVAddItem("EPIC", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_LEGENDARY = registerItem("iv_add_sp_def_legendary", new IVAddItem("LEGENDARY", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_MAX = registerItem("iv_add_sp_def_max", new IVAddItem("MAX", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_ATK_COMMON = registerItem("iv_add_sp_atk_common", new IVAddItem("COMMON", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_UNCOMMON = registerItem("iv_add_sp_atk_uncommon", new IVAddItem("UNCOMMON", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_RARE = registerItem("iv_add_sp_atk_rare", new IVAddItem("RARE", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_EPIC = registerItem("iv_add_sp_atk_epic", new IVAddItem("EPIC", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_LEGENDARY = registerItem("iv_add_sp_atk_legendary", new IVAddItem("LEGENDARY", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_MAX = registerItem("iv_add_sp_atk_max", new IVAddItem("MAX", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SPEED_COMMON = registerItem("iv_add_speed_common", new IVAddItem("COMMON", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_UNCOMMON = registerItem("iv_add_speed_uncommon", new IVAddItem("UNCOMMON", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_RARE = registerItem("iv_add_speed_rare", new IVAddItem("RARE", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_EPIC = registerItem("iv_add_speed_epic", new IVAddItem("EPIC", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_LEGENDARY = registerItem("iv_add_speed_legendary", new IVAddItem("LEGENDARY", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_MAX = registerItem("iv_add_speed_max", new IVAddItem("MAX", Stats.SPEED));
    public static final IVAddItem IV_ADD_ATK_COMMON = registerItem("iv_add_atk_common", new IVAddItem("COMMON", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_UNCOMMON = registerItem("iv_add_atk_uncommon", new IVAddItem("UNCOMMON", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_RARE = registerItem("iv_add_atk_rare", new IVAddItem("RARE", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_EPIC = registerItem("iv_add_atk_epic", new IVAddItem("EPIC", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_LEGENDARY = registerItem("iv_add_atk_legendary", new IVAddItem("LEGENDARY", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_MAX = registerItem("iv_add_atk_max", new IVAddItem("MAX", Stats.ATTACK));
    public static final IVAddItem IV_ADD_DEF_COMMON = registerItem("iv_add_def_common", new IVAddItem("COMMON", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_UNCOMMON = registerItem("iv_add_def_uncommon", new IVAddItem("UNCOMMON", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_RARE = registerItem("iv_add_def_rare", new IVAddItem("RARE", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_EPIC = registerItem("iv_add_def_epic", new IVAddItem("EPIC", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_LEGENDARY = registerItem("iv_add_def_legendary", new IVAddItem("LEGENDARY", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_MAX = registerItem("iv_add_def_max", new IVAddItem("MAX", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_HP_COMMON = registerItem("iv_add_hp_common", new IVAddItem("COMMON", Stats.HP));
    public static final IVAddItem IV_ADD_HP_UNCOMMON = registerItem("iv_add_hp_uncommon", new IVAddItem("UNCOMMON", Stats.HP));
    public static final IVAddItem IV_ADD_HP_RARE = registerItem("iv_add_hp_rare", new IVAddItem("RARE", Stats.HP));
    public static final IVAddItem IV_ADD_HP_EPIC = registerItem("iv_add_hp_epic", new IVAddItem("EPIC", Stats.HP));
    public static final IVAddItem IV_ADD_HP_LEGENDARY = registerItem("iv_add_hp_legendary", new IVAddItem("LEGENDARY", Stats.HP));
    public static final IVAddItem IV_ADD_HP_MAX = registerItem("iv_add_hp_max", new IVAddItem("MAX", Stats.HP));

    // LVLAddItems
    public static final LVLAddItem LVL_ADD_COMMON = registerItem("lvl_add_common", new LVLAddItem("COMMON"));
    public static final LVLAddItem LVL_ADD_UNCOMMON = registerItem("lvl_add_uncommon", new LVLAddItem("UNCOMMON"));
    public static final LVLAddItem LVL_ADD_RARE = registerItem("lvl_add_rare", new LVLAddItem("RARE"));
    public static final LVLAddItem LVL_ADD_EPIC = registerItem("lvl_add_epic", new LVLAddItem("EPIC"));
    public static final LVLAddItem LVL_ADD_LEGENDARY = registerItem("lvl_add_legendary", new LVLAddItem("LEGENDARY"));
    public static final LVLAddItem LVL_ADD_MAX = registerItem("lvl_add_max", new LVLAddItem("MAX"));

    // NatureChangerItems
    public static final NatureChangerItem NATURE_CHANGER_ADAMANT = registerItem("nature_changer_adamant", new NatureChangerItem(Natures.ADAMANT));
    public static final NatureChangerItem NATURE_CHANGER_BASHFUL = registerItem("nature_changer_bashful", new NatureChangerItem(Natures.BASHFUL));
    public static final NatureChangerItem NATURE_CHANGER_BOLD = registerItem("nature_changer_bold", new NatureChangerItem(Natures.BOLD));
    public static final NatureChangerItem NATURE_CHANGER_BRAVE = registerItem("nature_changer_brave", new NatureChangerItem(Natures.BRAVE));
    public static final NatureChangerItem NATURE_CHANGER_CALM = registerItem("nature_changer_calm", new NatureChangerItem(Natures.CALM));
    public static final NatureChangerItem NATURE_CHANGER_CAREFUL = registerItem("nature_changer_careful", new NatureChangerItem(Natures.CAREFUL));
    public static final NatureChangerItem NATURE_CHANGER_DOCILE = registerItem("nature_changer_docile", new NatureChangerItem(Natures.DOCILE));
    public static final NatureChangerItem NATURE_CHANGER_GENTLE = registerItem("nature_changer_gentle", new NatureChangerItem(Natures.GENTLE));
    public static final NatureChangerItem NATURE_CHANGER_HARDY = registerItem("nature_changer_hardy", new NatureChangerItem(Natures.HARDY));
    public static final NatureChangerItem NATURE_CHANGER_HASTY = registerItem("nature_changer_hasty", new NatureChangerItem(Natures.HASTY));
    public static final NatureChangerItem NATURE_CHANGER_IMPISH = registerItem("nature_changer_impish", new NatureChangerItem(Natures.IMPISH));
    public static final NatureChangerItem NATURE_CHANGER_JOLLY = registerItem("nature_changer_jolly", new NatureChangerItem(Natures.JOLLY));
    public static final NatureChangerItem NATURE_CHANGER_LAX = registerItem("nature_changer_lax", new NatureChangerItem(Natures.LAX));
    public static final NatureChangerItem NATURE_CHANGER_LONELY = registerItem("nature_changer_lonely", new NatureChangerItem(Natures.LONELY));
    public static final NatureChangerItem NATURE_CHANGER_MILD = registerItem("nature_changer_mild", new NatureChangerItem(Natures.MILD));
    public static final NatureChangerItem NATURE_CHANGER_MODEST = registerItem("nature_changer_modest", new NatureChangerItem(Natures.MODEST));
    public static final NatureChangerItem NATURE_CHANGER_NAIVE = registerItem("nature_changer_naive", new NatureChangerItem(Natures.NAIVE));
    public static final NatureChangerItem NATURE_CHANGER_NAUGHTY = registerItem("nature_changer_naughty", new NatureChangerItem(Natures.NAUGHTY));
    public static final NatureChangerItem NATURE_CHANGER_QUIET = registerItem("nature_changer_quiet", new NatureChangerItem(Natures.QUIET));
    public static final NatureChangerItem NATURE_CHANGER_QUIRKY = registerItem("nature_changer_quirky", new NatureChangerItem(Natures.QUIRKY));
    public static final NatureChangerItem NATURE_CHANGER_RASH = registerItem("nature_changer_rash", new NatureChangerItem(Natures.RASH));
    public static final NatureChangerItem NATURE_CHANGER_RELAXED = registerItem("nature_changer_relaxed", new NatureChangerItem(Natures.RELAXED));
    public static final NatureChangerItem NATURE_CHANGER_SASSY = registerItem("nature_changer_sassy", new NatureChangerItem(Natures.SASSY));
    public static final NatureChangerItem NATURE_CHANGER_SERIOUS = registerItem("nature_changer_serious", new NatureChangerItem(Natures.SERIOUS));
    public static final NatureChangerItem NATURE_CHANGER_TIMID = registerItem("nature_changer_timid", new NatureChangerItem(Natures.TIMID));

    private static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(Registries.ITEM, Identifier.of(CobblemizerMod.MODID, name), item);
    }

    public static void registerModItems() {
        CobblemizerMod.LOGGER.info("Register Mod Items for " + CobblemizerMod.MODID);
        CobblemizerItemGroups.registerItemGroups();
    }
}
