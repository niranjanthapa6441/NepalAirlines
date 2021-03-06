package com.FYP.BookingDetail.Booking;

import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    Iterable<Booking> findAll();
    BookingDTO update(String id,BookingRequest request);
    BookingDTO save(BookingRequest request);
    BookingDTO delete(String id);
    BookingDTO findById(String id);
    Iterable<Booking> findByCustomerId(String id);
}
