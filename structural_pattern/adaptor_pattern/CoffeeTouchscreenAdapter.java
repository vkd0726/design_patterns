public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

  OldCoffeeMachine OldVendingMachine;

  CoffeeTouchscreenAdapter(OldCoffeeMachine OldVendingMachine)
  {
    this.OldVendingMachine = OldVendingMachine;
  }

  public void chooseFirstSelector()
  {
    OldVendingMachine.selectA();
  }

  public void chooseSecondSelector()
  {
    OldVendingMachine.selectB();
  }
}
