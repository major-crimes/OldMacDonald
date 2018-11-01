class Chick implements Animal 
{     
  private String myType;
  private String mySound;

  public Chick(String type, String sound, String sound2) {
    if ((int)(Math.random()*2) < 1) {
      mySound = sound2;
    } else
      mySound = sound;
    myType = type;
  }


  public Chick() {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound() {
    return mySound;
  }
  public String getType() {
    return myType;
  }
}
