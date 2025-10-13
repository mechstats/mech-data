# Mechabellum Game Data
These files are generated from the video game, Mechabellum. I claim no ownership of the data, I'm just sharing the 
information.

Note that while the extraction process is automated, it is non-trivial and there may be mistakes. Let me know if you
find any!

---
# Usage
If you want to build any automation around the replay xml files used by the game, you'll probably want to translate the numeric
ids into their actual game names. For example, the `Mountain` mech has an id of `2002`. 

Each of the generated files will contain a `Map<String, Entity>`, with the key of the map being the id of the unit used
by the replay files.