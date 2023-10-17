const unsortedArray = [10,13,32,28,44,15,3];
const sortedArray = unsortedArray.sort((a,b) => {
return b-a;
});
document.write(unsortedArray);