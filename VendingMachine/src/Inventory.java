public class Inventory {

  ItemShelf itemShelf[] = null;

  Inventory(int itemCount) {
    itemShelf = new ItemShelf[itemCount];
    initialEmptyInventory();
  }

  public ItemShelf[] getItemShelf() {
    return itemShelf;
  }

  public void setItemShelf(ItemShelf[] inventory) {
    this.itemShelf = itemShelf;
  }

  public void initialEmptyInventory() {
    int startCode = 101;
    for (int i = 0; i < itemShelf.length; i++) {
      ItemShelf space = new ItemShelf();
      space.setCode(startCode);
      space.setSoldOut(true);
      itemShelf[i] = space;
      startCode++;
    }
  }

  public void addItem(Item item, int codeNumber) throws Exception {

    for (ItemShelf itemShelf : itemShelf) {
      if (itemShelf.code == codeNumber) {
        if (itemShelf.isSoldOut()) {
          itemShelf.item = item;
          itemShelf.setSoldOut(false);
        } else {
          throw new Exception("already item is present, you can not add item here");
        }
      }
    }
  }

  public Item getItem(int codeNumber) throws Exception {

    for (ItemShelf itemShelf : itemShelf) {
      if (itemShelf.code == codeNumber) {
        if (itemShelf.isSoldOut()) {
          throw new Exception("item already sold out");
        } else {

          return itemShelf.item;
        }
      }
    }
    throw new Exception("Invalid Code");
  }

  public void updateSoldOutItem(int codeNumber) {
    for (ItemShelf itemShelf : itemShelf) {
      if (itemShelf.code == codeNumber) {
        itemShelf.setSoldOut(true);
      }
    }
  }
}
