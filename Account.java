import java.util.random.RandomGenerator;

public class Account {
        private long money;
        private String accNumber;

        public void setAccNumber() {
                String accNumber = RandomGenerator.getDefault().toString();
                this.accNumber = accNumber;
        }
        public void setMoney(long money) {
                this.money = money;
        }

        public Account(long money){
                this.money = money;
                setAccNumber();
        }
        public Account(long money, String accNumber){
                this.money = money;
                this.accNumber = accNumber;
        }

        public String getAccNumber(){
                return accNumber;
        }
        public long getMoney(String accNumber){
                return money;
        }

}

