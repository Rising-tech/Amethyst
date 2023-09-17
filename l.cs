body {
    margin: 0;
    overflow: hidden;
    background-color: black;
}

.starry-universe {
    position: absolute;
    width: 100%;
    height: 100%;
    animation: stars 50s linear infinite;
}

.star {
    position: absolute;
    background-color: white;
    width: 2px;
    height: 2px;
    border-radius: 50%;
    animation: twinkle 2s infinite alternate;
}

@keyframes stars {
    from {
        transform: translateY(0);
    }
    to {
        transform: translateY(-100%);
    }
}

@keyframes twinkle {
    0% {
        opacity: 1;
    }
    100% {
        opacity: 0;
    }
}

/* Add more styling and stars as needed */
