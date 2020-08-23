package student_dmitry_vasiliev.lesson_3.level_6;

class BankAccount {

        private String owner;
        private int money;

        public BankAccount(String owner, int money) {
            this.owner = owner;
            this.money = money;
        }

        public String getOwner() {
            return this.owner;
        }

        public int getMoney() {
            return this.money;
        }

    }
