import { CustomComponentParameters, ItemCompleteUseEvent } from "@minecraft/server";
import { array, create, defaulted, number, object, optional, string, Struct } from "superstruct";

export interface BandageEffect {
  effect: string;
  amplifier: number;
  duration: number;
}

export class BandageComponent {
  static typeId = "lpsm_bandages:bandage";
  struct: Struct<any, any> = array(
    object({
      effect: string(),
      duration: defaulted(number(), 1200),
      amplifier: optional(number()),
    }),
  );

  constructor() {
    this.onCompleteUse = this.onCompleteUse.bind(this);
  }

  onCompleteUse(event: ItemCompleteUseEvent, args: CustomComponentParameters): void {
    const effects = create(args.params, this.struct) as BandageEffect[];

    // Additional effects.
    for (const effect of effects) {
      console.warn(effect.effect);
    }
    console.warn("TEST");
  }
}
