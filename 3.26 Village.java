public class Village {

        public static void main(String[] args) {}
                private int people;
                private static int waterAmount;

                void setPeopleNumber(int p) {
                        people = p;
                }

                int getPeopleNumber() {
                        return people;
                }

                static void setWaterAmount(int w) {
                        waterAmount = w;
                }
                public void drinkWater(int d) {
                        waterAmount = waterAmount-d;
                }
                int lookWaterAmount(){
                        return waterAmount;
                }

        }

