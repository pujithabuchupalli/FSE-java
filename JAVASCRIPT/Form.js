const form = document.getElementById("regForm");
const errors = document.getElementById("errors");

form.addEventListener("submit", e => {
  e.preventDefault();
  errors.textContent = "";
  const { name, email, event } = form.elements;

  if (!name.value || !email.value.includes("@") || !event.value) {
    errors.textContent = "Please fill all fields correctly.";
  } else {
    errors.textContent = "Registered successfully!";
  }
});
