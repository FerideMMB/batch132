package practices.practice09;

public class Q02_Static_Budget {
    public static void main(String[] args) {
        //Type a basic home budget
        Budget father = new Budget();
        father.getSalary(5000);
        father.getPocketMoney(500);
        System.out.println("Father pocket money" + father.pocketMoney);//500

        Budget mother= new Budget();
        mother.getPocketMoney(1000);
        System.out.println("Mother pocket money: " + mother.pocketMoney);//1000

        System.out.println("Family budget: " + Budget.familyBudget);//3500
        System.out.println("Mother family budget: "+ mother.familyBudget);//3500
        System.out.println("Father family budget: "+ father.familyBudget);//3500

        mother.spendPocketMoney(900);
        System.out.println("Mother pocket money= "+ mother.pocketMoney);//100
        System.out.println("Father pocket money= "+ father.pocketMoney);//500
        System.out.println("Family budget ="+ Budget.familyBudget);

        mother.getSalary(3000);
        mother.spendFamilyBudget(2000);
        Budget.spendFamilyBudget(500);
        System.out.println("Mother pocket money= "+ mother.pocketMoney);//100
        System.out.println("Father pocket money= "+ father.pocketMoney);//500
        System.out.println("Family budget ="+ Budget.familyBudget);//4000
    }
}
