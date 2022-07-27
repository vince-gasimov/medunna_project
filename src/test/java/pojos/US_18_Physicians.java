package pojos;

    import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class US_18_Physicians {

        private String firstName;
        private String lastName;
        private String login;
        private String ssn;
        private int id;
        private String email;
        private String createdBy;
        private String langKey;
        private String createdDate;
        private String birthDate;
        private String gender;

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }


        private String phone;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }


        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }


        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getSsn() {
            return ssn;
        }

        public void setSsn(String ssn) {
            this.ssn = ssn;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getLangKey() {
            return langKey;
        }

        public void setLangKey(String langKey) {
            this.langKey = langKey;
        }

        @Override
        public String toString() {
            return "US_18_Physicians{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", login='" + login + '\'' +
                    ", ssn='" + ssn + '\'' +
                    ", id=" + id +
                    ", email='" + email + '\'' +
                    ", createdBy='" + createdBy + '\'' +
                    ", langKey='" + langKey + '\'' +
                    ", createdDate='" + createdDate + '\'' +
                    ", birthDate='" + birthDate + '\'' +
                    ", phone='" + phone + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';

        }

    }


