public class Land {
    public static void main(String[] args) {
        Village village1 = new Village();
        Village village2 = new Village();

        village1.setPeopleNumber(80);
        village2.setPeopleNumber(120);

        Village.setWaterAmount(200);
        
        System.out.println("赵庄的人数量是"+village1.getPeopleNumber());
        System.out.println("马家河子的人数量是"+village2.getPeopleNumber());

        village1.drinkWater(50);
        System.out.println("赵庄喝掉了井水"+"剩余井水"+village1.lookWaterAmount());

        village2.drinkWater(100);
        System.out.println("马家河子喝掉了井水"+"剩余井水"+village2.lookWaterAmount());
    }
}