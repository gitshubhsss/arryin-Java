let decrease=document.querySelector("#decrease");
let reset=document.querySelector("#reset");
let increase=document.querySelector("#increase");


let p=document.querySelector("p");

let count=0;

decrease.addEventListener("click",()=>{
    if(count>0){
        count--;
        p.innerText=count;
    }
})

reset.addEventListener("click",()=>{
        count=0;
        p.innerText=count;
})
increase.addEventListener("click",()=>{
    count++;
    p.innerText=count;
})
