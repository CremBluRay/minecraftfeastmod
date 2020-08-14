# Minecraft Feast Mod ⛏

### Description
Add various new food items and entities to Minecraft. Foods, such as the turkey, can be placed onto tables and eaten by players.

### Screenshots
<p align="center">
    <img width="768" height="432" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/turkey_block_table.png">
</p>
<p align="center">
    <img width="768" height="432" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/turkey_entity_2.png">
</p>

### Recipes
<p align="left">
    <img width="246" height="119" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/bread_recipe.png">
</p>
<p align="left">
    <img width="246" height="119" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/burger_recipe.png">
</p>
<p align="left">
    <img width="246" height="119" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/dough_recipe.png">
</p>
<p align="left">
    <img width="246" height="119" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/yeast_recipe.png">
</p>
<p align="left">
    <img width="168" height="115" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/cooked_bacon_recipe.png">
</p>
<p align="left">
    <img width="168" height="115" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/turkey_block_recipe.png">
</p>
<p align="left">
    <img width="168" height="115" src="https://raw.githubusercontent.com/CremBluRay/CremBluRay.github.io/master/assets/images/demo/feastmod/bread_roll_recipe.png">
</p>

### Source Installation

Step 1: Open your command-line and browse to the folder where you extracted the zip file.

Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command: "gradlew genEclipseRuns" (./gradlew genEclipseRuns if you are on Mac/Linux)
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run "gradlew eclipse" to generate the project.
(Current Issue)
4. Open Project > Run/Debug Settings > Edit runClient and runServer > Environment
5. Edit MOD_CLASSES to show [modid]%%[Path]; 2 times rather then the generated 4.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: "gradlew genIntellijRuns" (./gradlew genIntellijRuns if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can run "gradlew --refresh-dependencies" to refresh the local cache. "gradlew clean" to reset everything {this does not affect your code} and then start the processs again.

### CONTRIBUTING
If you'd like to make a contribution, please refer to [CONTRIBUTING.md](https://github.com/CremBluRay/minecraftfeastmod/blob/master/CONTRIBUTING.md)