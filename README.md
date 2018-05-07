# Winnable Hardcore Superflat Mode Mod

This mod is intended to make Minecraft's Hardcore Superflat mode actually winnable, meaning it is possible to actually gather the materials needed to get to The End and defeat the ender dragon. It will still be challenging, but some of the previously impossible tasks (like creating and activating an end portal) are now possible.

## Setup
I was able to get this to run on my mac running OSX 10.13 using Java version "1.8.0_92" with the latest version of Minecraft installed. YMMV

- Obtain a copy of the forge .mdk file from [here](http://files.minecraftforge.net/).
- Extract the file into a new directory.
- Open the terminal and navigate to that directory.
- Run the command `./gradlew setupDecompWorkspace`. This is going to download a ton of files and decompile Minecraft. It took me ~20 minutes.
- If you want to edit the files, download Eclipse and run `./gradlew eclipse`.
- When you open Eclipse, set the project folder to be one directory above where you have your extracted Forge distribution. 
- Import the directory as a project into Eclipse which should handle everything.
- Open `ExampleMod.java` that is in `src/main/java/com/example/examplemod`.
- Delete all that useless code!
- Copy the code from `ExampleMod.java` that is in this repo into `src/main/java/com/example/examplemod/ExampleMod.java`.

## Running the Mod
Currently the mod has not been all packaged together so it will need to be run from the command line. Sorry.

- Run `./gradlew build`. According to the documentation, this should output a .jar file for the mod. It does not when I run it on my machine.
- Run `./gradlew runClient`. It takes about a minute but the Minecraft launcher should load with the mod.
- Create a superflat world in hardcore mode.
- Good luck!

## Mod Features
There are currently 14 new crafting recipes and 4 new items that can be created via smelting

### Crafting recipes

|Outputs|1|Diamond|
|---|---|---|
|Gold ingot|Gold ingot|Gold ingot|
|Gold ingot|Gold ingot||
|Gold ingot|Gold ingot|Gold ingot|

|Outputs|1|Gold Ingot|
|---|---|---|
|Iron ingot|Iron ingot|Iron ingot|
|Iron ingot|Iron ingot||
|Iron ingot|Iron ingot|Iron ingot|

|Outputs|1|Iron Ingot|
|---|---|---|
|Cobblestone|Cobblestone|Cobblestone|
||||
|Cobblestone|Cobblestone|Cobblestone|

|Outputs|8|Cobblestone|
|---|---|---|
|Dirt|Dirt|Dirt|
|Dirt|Rotten Flesh|Dirt|
|Dirt|Dirt|Dirt|

|Outputs|1|Ender Eye|
|---|---|---|
|Glowstone||Glowstone|
|Rotten Flesh|Glowstone|Rotten Flesh|
|Rotten Flesh|Glowstone|Rotten Flesh|

|Outputs|1|End Portal Frame|
|---|---|---|
|Glowstone|Ender Eye|Glowstone|
|Glowstone|Blaze Rod|Glowstone|
|Diamond|Diamond|Diamond|

|Outputs|8|Sandstone|
|---|---|---|
|Wood Planks|Wood Planks|Wood Planks|
|Wood Planks|Cobblestone|Wood Planks|
|Wood Planks|Wood Planks|Wood Planks|

|Outputs|1|Glowstone|
|---|---|---|
|Blaze Rod|Blaze Rod|Blaze Rod|
|Blaze Rod|Gold Block|Blaze Rod|
|Blaze Rod|Blaze Rod|Blaze Rod|

|Outputs|1|Sapling|
|---|---|---|
|Leaves|Leaves|Leaves|
|Leaves|Stick|Leaves|
||Stick||

|Outputs|1|Emerald|
|---|---|---|
||Iron Ingot||
|Iron Ingot|Gold Ingot|Iron Ingot|
||Iron Ingot||

|Outputs|1|Stone Sword|
|---|---|---|
||||
||Cobblestone||
||Wood Sword||

|Outputs|1|Iron Sword|
|---|---|---|
||||
||Iron Ingot||
||Stone Sword||

|Outputs|1|Golden Sword|
|---|---|---|
||||
||Gold Ingot||
||Iron Sword||

|Outputs|1|Diamond Sword|
|---|---|---|
||||
||Diamond||
||Gold Sword||

### Smelting Recipes

- Water Bucket -> 1 Lava Bucket
- Leaves -> 1 Sugarcane
- SandStone -> 8 Sand

Smelting any sword will give a blaze rod. A more rare sword will lead to more experience gained and more blaze rods.

- Stone sword -> 1 Blaze Rod
- Iron Sword -> 2 Blaze Rods
- Gold Sword -> 4 blaze Rods
- Diamond Sword -> 8 blaze Rods
