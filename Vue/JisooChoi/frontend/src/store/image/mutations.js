import{
    REQUEST_IMAGE_TO_SPRING,
}from "./mutation-types";

export default{
    [REQUEST_IMAGE_TO_SPRING] (state, receivedDate) {
        state.name = receivedDate;
    }
}