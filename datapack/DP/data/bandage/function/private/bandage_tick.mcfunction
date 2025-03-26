# Made by: @Legopitstop
# Desc: Bandage tick
#
# Called By: bandage:main_tick

# Stop the arrow sound
stopsound @s player minecraft:entity.arrow.shoot

# give player arrow in the offhand if they don't have one
execute unless entity @s[nbt={equipment:{offhand: {id: "minecraft:arrow"}}}] unless data entity @s equipment.offhand run item replace entity @s weapon.offhand with arrow[item_model="bandage:invisible",tooltip_display={hide_tooltip:true},custom_data={invisible:true}]

# error is player has item in offhand
execute unless entity @s[nbt={equipment:{offhand:{components:{"minecraft:custom_data":{invisible:true}}}}}] run title @p actionbar [{"translate":"bandage.offhand_item","color":"red"}]

# bandage
execute as @a[scores={bandage.UsedBow=1..}] at @s if entity @e[type=arrow,sort=nearest,nbt={crit:1b}] run function bandage:private/used
execute as @a[scores={bandage.UsedBow=1..}] at @s run function bandage:private/reset
