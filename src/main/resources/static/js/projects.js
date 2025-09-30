document.addEventListener("DOMContentLoaded", function () {
    const projectImages = document.querySelectorAll('.project-img');
    const modalImage = document.getElementById('modalImage');

    projectImages.forEach(img => {
        img.addEventListener('click', () => {
            const fullImg = img.getAttribute('data-img');
            modalImage.src = fullImg;
            const modal = new bootstrap.Modal(document.getElementById('imageModal'));
            modal.show();
        });
    });
});