// Get all nav links
const navLinks = document.querySelectorAll('nav ul li a');

// Add an event listener to each nav link
navLinks.forEach((link) => {
  link.addEventListener('click', (e) => {
    // Prevent default link behavior
    e.preventDefault();

    // Get the target section
    const targetSection = document.querySelector(link.getAttribute('href'));

    // Add a smooth scrolling effect
    targetSection.scrollIntoView({
      behavior: 'smooth',
      block: 'start',
    });
  });
});