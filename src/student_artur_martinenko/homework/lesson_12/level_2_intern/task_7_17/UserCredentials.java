package student_artur_martinenko.homework.lesson_12.level_2_intern.task_7_17;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    //Task_15
    public boolean hasRole(Role role) {
        return roles.contains(role);
    }


}


//Task_8
/*
В теории и на практике у клиентов могут быть разные права
и у одного клиента может быть много разных ролей.

Для описания прав доступа, которые есть у того кто делает
запрос к банковской системе создайте класс UserCredentials:

class UserCredentials {

    private List<Role> roles;

    // созжайте конструктор класса, в котором вы получаете список ролей

}
 */

//Task_15
/*
Маленькое улучшение кода (рефакторинг).

Как можно упростить это условие?

credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)

Строка кода в которой слишком много точек (вызовов методов)
трудно читается, чем больше точек тем за большим количеством
вызовов методов нужно проследить, что бы понять что делает
такой код.

Подсказка: операция по проверке роли должна находиться там,
где находятся данные которые ей нужны для этой проверки.
 */
