function validateform() {
        var phone = document.formKH.sodienthoai.value;
        var email = document.formKH.diachiemail.value;
        var errorEmail = document.getElementById('errorEmail');
        const regexEmail = "/^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i";
 
        if (!email.match(regexEmail)) {
            errorEmail.innerHTML = "Email không hợp lệ"
            return false;
        }
        errorEmail.innerHTML = ""
        return true;
    }