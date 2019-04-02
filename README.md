**ProductsChallenge**

**Further Improvements**

* Add more unit tests. Unit tests can be written for the ColorConverter and the Repository
* A TypeAdapter can be used to handle where "now" sometimes returns a String and sometimes and Object. 
  Currently the app defines the Now field as an Object and Gson parses the fields into a LinkedTreeMap if it finds an Object. 
* Properly display color swatches - currently the app displays all the available converted RGB colors in a LinearLayout for each product item. 
  An alternative would be to have a scrollable view, like a RecyclerView, where all the colors and the related info (skuid, basicColor) can be displayed.
  The latter were omitted to make for a clean UI. 
* UX wise, search can be added