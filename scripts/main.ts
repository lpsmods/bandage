import { StartupEvent, system } from "@minecraft/server";
import { registerItemComponents } from "./registry.js";
import { AddonUtils } from "@lpsmods/mc-utils";
import { PROJECT_ID } from "./constants.js";

AddonUtils.addonId = PROJECT_ID;

function startup(event: StartupEvent): void {
  registerItemComponents(event.itemComponentRegistry);
}

system.beforeEvents.startup.subscribe(startup);
