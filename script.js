let namastebtn=document.querySelector('button');
namastebtn.addEventListener('click',inputMsg);
function inputMsg(){
   let name= prompt('enter your wifi password');
   namastebtn.textContent='pi/6'+ name;
}