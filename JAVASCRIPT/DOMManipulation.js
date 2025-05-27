const events = [
  { name: "Music Festival", seats: 2 },
  { name: "Baking Workshop", seats: 1 }
];

let container = document.querySelector("#events");
if (!container) {
  container = document.createElement("div");
  container.id = "events";
  document.body.appendChild(container);
}

function showEvents() {
  container.innerHTML = "";
  events.forEach((e) => {
    const div = document.createElement("div");
    div.textContent = `${e.name} - Seats: ${e.seats} `;

    const registerBtn = document.createElement("button");
    registerBtn.textContent = "Register";
    registerBtn.disabled = e.seats === 0;
    registerBtn.onclick = () => {
      if (e.seats > 0) {
        e.seats--;
        showEvents();
      }
    };

    const cancelBtn = document.createElement("button");
    cancelBtn.textContent = "Cancel";
    cancelBtn.disabled = e.seats >= 5; // assuming max seats = 5
    cancelBtn.onclick = () => {
      if (e.seats < 5) {
        e.seats++;
        showEvents();
      }
    };

    div.appendChild(registerBtn);
    div.appendChild(cancelBtn);
    container.appendChild(div);
  });
}

showEvents();
