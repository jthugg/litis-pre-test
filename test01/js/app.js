const redBox = document.getElementById('redBox');
let count = 0;

redBox.addEventListener('click', () => {
  redBox.innerText = ++count;
})
