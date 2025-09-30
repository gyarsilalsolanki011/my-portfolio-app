document.addEventListener("DOMContentLoaded", function () {
    const modalImage = document.getElementById('modalImage');
    const prevBtn = document.getElementById('prevBtn');
    const nextBtn = document.getElementById('nextBtn');

    let currentIndex = 0;
    let currentImages = [];

    document.querySelectorAll('.project-screenshots').forEach(project => {
        const images = project.querySelectorAll('.project-img');

        images.forEach((img, idx) => {
            img.addEventListener('click', () => {
                currentImages = images; // set images for this project
                currentIndex = idx;
                modalImage.src = img.src;

                const modal = new bootstrap.Modal(document.getElementById('imageModal'));
                modal.show();

                // Show/hide navigation buttons
                if (images.length > 1) {
                    prevBtn.style.display = 'block';
                    nextBtn.style.display = 'block';
                } else {
                    prevBtn.style.display = 'none';
                    nextBtn.style.display = 'none';
                }
            });
        });
    });

    prevBtn.addEventListener('click', () => {
        currentIndex = (currentIndex - 1 + currentImages.length) % currentImages.length;
        modalImage.src = currentImages[currentIndex].src;
    });

    nextBtn.addEventListener('click', () => {
        currentIndex = (currentIndex + 1) % currentImages.length;
        modalImage.src = currentImages[currentIndex].src;
    });
});