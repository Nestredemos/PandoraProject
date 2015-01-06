package pandora;

import java.util.ArrayList;

public class Item {

  private final String nameItem;
  

  public Item(String name) {
      this.nameItem = name;
  }

  public void moveItem(ArrayList<Item> containedItem, ArrayList<Item> Inventory, String nameNewItem){
      for(Item test : containedItem){
          if(test.nameItem.equals(nameNewItem)){
            Inventory.add(test);
          }
      }
  }

  public void destroyItem(ArrayList<Item> inventory, Item oldItem){
      for(Item test : inventory){
          if(test.equals(oldItem)){
              inventory.remove(test);
          }
      }
  }

  public void showItem(ArrayList<Item> inventory){
      for(Item test : inventory){
          System.out.println(test.nameItem);
      }
  }

}