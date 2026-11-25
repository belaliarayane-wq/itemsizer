# ItemSizer Minecraft Mod (Fabric 1.21.1)

## How to Build the `.jar` File
Because compiling a Minecraft mod requires downloading Mojang and Fabric mappings from the internet, you need to build the `.jar` on your computer using Gradle:

1. Extract this ZIP folder.
2. Open a terminal/command prompt inside the extracted folder (or open the folder in **IntelliJ IDEA**).
3. Run the build command:
   - **Windows:** `gradle build` (or `./gradlew build` if using IntelliJ's bundled Gradle)
   - **Mac/Linux:** `gradle build`
4. Find your compiled mod at: `build/libs/itemsizer-1.0.0.jar`
5. Copy `itemsizer-1.0.0.jar` and **Fabric API** into your `.minecraft/mods` folder.

## In-Game Usage
Type `/itemsize <scale>` in chat (e.g., `/itemsize 3.0` for 3x size, `/itemsize 0.5` for half size, `/itemsize 1.0` to reset).
