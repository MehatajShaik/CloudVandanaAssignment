var senetnce = prompt("Enter a sentence :");
//reverse string
var reverseSentence = reverseWord(senetnce,"");
var output = reverseWord(reverseSentence," ");
document.write(output);

function reverseWord(senetnce,separator){
  return senetnce.split(separator).reverse().join(separator);
}