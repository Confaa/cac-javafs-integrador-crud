const readURL = (input) => {
  if (input.files && input.files[0]) {
    let reader = new FileReader();
    reader.onload = (e) => {
      document.getElementById("form__img").removeAttribute("src");
      document.getElementById("form__img").setAttribute("src", e.target.result);
    };
    reader.readAsDataURL(input.files[0]);
  }
};
document.getElementById("file").addEventListener("change", (e) => {
  console.log(document.getElementById("file"));
  readURL(document.getElementById("file"));
});
