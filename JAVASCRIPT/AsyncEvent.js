let container = document.querySelector("#events");
if (!container) {
  container = document.createElement("div");
  container.id = "events";
  document.body.appendChild(container);
}

async function loadEvents() {
  container.textContent = "Loading...";
  try {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts/1");
    if (!res.ok) throw new Error("Fetch failed");
    const data = await res.json();
    container.textContent = `Event: ${data.title}`;
  } catch (e) {
    container.textContent = "Error loading events";
  }
}

loadEvents();
