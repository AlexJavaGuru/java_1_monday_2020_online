package student_andris_tresutins.homework.lesson_9.level_1;

class Safe_T5 {
    private String password;
    private int money;

    Safe_T5(String password, int money){
        this.password = password;
        this.money = money;
    }

    public int getMoneyInfo(){
        return money;
    }
    public int getMoney(String password, int amount){
        if(checkPassword(password)){
            money -= amount;
            return amount;
        }
        else{
            return 0;
        }
    }

    public int putMoney(String password, int amount){
        if(checkPassword(password)){
            money += amount;
            return amount;
        }
        else{
            return 0;
        }
    }

    private boolean checkPassword(String password){
        return this.password.equals(password);
    }

}
