const form = document.getElementById("regForm");
const msg = document.getElementById("errors");

form.addEventListener("submit", e => {
  e.preventDefault();
  msg.textContent = "";

  const { name, email, event } = form.elements;

  if (!name.value || !email.value.includes("@") || !event.value) {
    msg.textContent = "Fill all fields correctly.";
    return;
  }

  msg.textContent = "Submitting...";

  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ name: name.value, email: email.value, event: event.value })
    })
    .then(res => res.ok ? msg.textContent = "Success!" : Promise.reject())
    .catch(() => msg.textContent = "Submission failed.");
  }, 1000);
});
