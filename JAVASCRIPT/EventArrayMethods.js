const communityEvents = [];
communityEvents.push(
  { name: "Music Festival", category: "Music" },
  { name: "Workshop on Baking", category: "Cooking" },
  { name: "Jazz Night", category: "Music" },
  { name: "Art Exhibition", category: "Art" }
);
const musicEvents = communityEvents.filter(event => event.category === "Music");
const displayCards = communityEvents.map(event => `${event.name}`);
console.log("Music Events:", musicEvents);
console.log("Display Cards:", displayCards);
