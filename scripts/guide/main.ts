import { Pages } from "@lpsmods/mc-utils";
import { changelogs } from "./changelogs";
import { items } from "./items";

export const pages: Pages = {
  home: {
    title: "guide.common.guide_book",
    body: "#desc",
    buttons: ["items", "changelogs"],
  },
  ...items,
  ...changelogs,
};
