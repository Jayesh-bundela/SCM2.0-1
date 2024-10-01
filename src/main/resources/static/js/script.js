console.log("script loaded");

// Get initial theme from localStorage or default to "light"
let currentTheme = getTheme();

// Function to change the theme
function changeTheme() {
    changePageTheme(currentTheme);

    // Set listener for theme change button
    const ctButton = document.querySelector('#theme_change_button');
    ctButton.querySelector("span").textContent = currentTheme === "light" ? "dark" : "light";
    ctButton.addEventListener("click", (event) => {
        console.log("button clicked");

        // Toggle currentTheme between "light" and "dark"
        currentTheme = currentTheme === "dark" ? "light" : "dark";
        changePageTheme(currentTheme);
    });
}

// Set theme in localStorage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

// Get theme from localStorage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light"; // Default to "light" if no theme is set
}

// Change page theme
function changePageTheme(theme) {
    // Update current theme in localStorage
    setTheme(theme);

    // Update theme classes on <html> element
    document.querySelector("html").classList.remove("light", "dark");
    document.querySelector("html").classList.add(theme);

    // Change text content of theme change button
    document.querySelector('#theme_change_button').querySelector("span").textContent = theme === "light" ? "dark" : "light";
}

// Initialize theme change functionality after DOM content is loaded
document.addEventListener("DOMContentLoaded", () => {
    changeTheme();
});
