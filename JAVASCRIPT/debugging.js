const form = document.getElementById("regForm");
const msg = document.getElementById("errors");

form.addEventListener("submit", e => {
  e.preventDefault();
  msg.textContent = "Submitting...";

  const { name, email, event } = form.elements;
  console.log("Name:", name.value);
  console.log("Email:", email.value);
  console.log("Event:", event.value);

  const data = {
    name: name.value,
    email: email.value,
    event: event.value
  };

  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(result => {
      console.log("Success:", result);
      msg.textContent = "Registered!";
    })
    .catch(err => {
      console.error("Error:", err);
      msg.textContent = "Error submitting form.";
    });
  }, 1000);
});
