const form = document.getElementById('survey-form');
const submitButton = document.getElementById('submit-button');
const resetButton = document.getElementById('reset-button');
submitButton.addEventListener('click', function (e) {
    e.preventDefault();
    // Perform validation here
    // For simplicity, we'll assume all fields are valid
    // Display the popup
    const popupContent = `
        First Name: ${document.getElementById('first-name').value}
        Last Name: ${document.getElementById('last-name').value}
        Date of Birth: ${document.getElementById('date-of-birth').value}
        Country: ${document.getElementById('country').value}
        Gender: ${[...document.getElementsByName('gender')].filter(cb => cb.checked).map(cb => cb.value).join(', ')}
        Profession: ${document.getElementById('profession').value}
        Email: ${document.getElementById('email').value}
        Mobile Number: ${document.getElementById('mobile-number').value}
    `;
    alert(popupContent);
    // Reset the form
    form.reset();
});
resetButton.addEventListener('click', function () {
    form.reset();
});