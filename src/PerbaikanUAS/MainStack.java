package PerbaikanUAS;
public class MainStack {
    public static void main(String[] args) {
        Stack newStack = new Stack(10);
        newStack.push(10);
        newStack.printData();
        newStack.push(20);
        newStack.printData();
        newStack.push(40);
        newStack.printData();
        newStack.pop();
        newStack.printData();
        newStack.push(60);
        newStack.printData();
        newStack.pop();
        newStack.printData();
        long bacaTop = newStack.peek();
        System.out.println("nilai top = "+bacaTop);
        System.out.println("Sekhuddin");
    }   
}
