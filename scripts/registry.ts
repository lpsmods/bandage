import { BandageComponent } from "./item/bandage.js";
import { ItemComponentRegistry } from "@minecraft/server";
import { AddonUtils, GuideBookComponent } from "@lpsmods/mc-utils";
import { pages } from "./guide/main.js";

export function registerItemComponents(reg: ItemComponentRegistry): void {
  reg.registerCustomComponent(BandageComponent.typeId, new BandageComponent());
  reg.registerCustomComponent(AddonUtils.makeId("guide_book"), new GuideBookComponent(pages));
  GuideBookComponent.setup(AddonUtils.makeId("guide_book"));
}
