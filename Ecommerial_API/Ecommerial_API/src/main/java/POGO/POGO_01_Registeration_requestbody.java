package POGO;
public class POGO_01_Registeration_requestbody {

        private String firstName;
        private String lastName;
        private String userEmail;
        private String userRole;
        private String occupation;
        private String gender;
        private String userMobile;
        private String userPassword;
        private String confirmPassword;
        boolean required;
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getLastName() {
            return lastName;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }
        public String getUserEmail() {
            return userEmail;
        }

        public void setUserRole(String userRole) {
            this.userRole = userRole;
        }
        public String getUserRole() {
            return userRole;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }
        public String getOccupation() {
            return occupation;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
        public String getGender() {
            return gender;
        }

        public void setUserMobile(String userMobile) {
            this.userMobile = userMobile;
        }
        public String getUserMobile() {
            return userMobile;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }
        public String getUserPassword() {
            return userPassword;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }
        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setRequired(boolean required) {
            this.required = required;
        }
        public boolean getRequired() {
            return required;
        }
    }
