package student_andris_tresutins.homework.Lesson_12.level_2;

import teacher.annotations.CodeReview;

import java.util.List;

@CodeReview(approved = true)
public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;

    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public List<Role> getRoles() {
        return roles;
    }
}
