//执行具体的表单验证逻辑
window.onload=function () {
    var radios=document.querySelectorAll("input[type='radio']");
    for (var i=0;i<radios.length;i++){
        radios[i].addEventListener('change',function () {
            var name=this.getAttribute("name");
            if(this.value==='no'){
                document.getElementsByName(name+"Detail")[0].setAttribute("disabled","true");
            }else{
                document.getElementsByName(name+"Detail")[0].removeAttribute("disabled");
            }
        })
    }


}
function checkForm() {
    // //拿到日期输入框的值
    // var uploadDate=document.getElementsByName("uploadDate")[0].value;
    // //拿到学生名字输入框的值
    // var studentName=document.getElementsByName("studentName")[0].value;
    // //拿到班级名称输入框的值
    // var classId=document.getElementsByName("classId")[0].value;
    // //拿到体温输入框的值
    // var temperature=document.getElementsByName("temperature")[0].value;
    // //拿到电话号码输入框的值
    // var telephone=document.getElementsByName("telephone")[0].value;

    var fever =document.getElementsByName("fever");
    var feverDetail=document.getElementsByName("feverDetail")[0].value;
    var contact=document.getElementsByName("contact");
    var contactDetail=document.getElementsByName("contactDetail")[0].value;
    var situation =document.getElementsByName("situation");
    var situationDetail=document.getElementsByName("situationDetail")[0].value;
    if((!fever[0].checked&&!fever[1].checked)
        ||(!contact[0].checked&&!contact[1].checked)
        ||(!situation[0].checked&&!situation[1].checked)){
        alert("单选框不能为空");
        return false;
    }
    if(fever[0].checked){
        if(feverDetail==""){
            alert("请描述具体症状");
            return false;
        }
    }
    if(contact[0].checked){
        if(contactDetail==""){
            alert("请描述具体的接触过程");
            return false;
        }
    }
    if(fever[0].checked){
        if(situationDetail==""){
            alert("请描述需要注意的情况");
            return false;
        }
    }
    return true;
}