import java.util.*;
class Vehicle {
    String id, type;
    int entrytime;

    Vehicle(String id, String type, int entry_time) {
        this.id = id;
        this.type = type;
        this.entrytime = entry_time;
    }
}

class Slot {
    String type;
    String slotName;
    Vehicle vehicle;

    Slot(String type, String slotName) {
        this.type = type;
        this.slotName = slotName;
    }

    boolean isEmpty() {
        return vehicle == null;
    }
}

class Floor {
    int floorNumber;
    List<Slot> carSlots = new ArrayList<>();
    List<Slot> bikeSlots = new ArrayList<>();
    List<Slot> truckSlots = new ArrayList<>();

    Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        for (int i = 0; i < 6; i++) {
            carSlots.add(new Slot("Car", "C" + i));
        }
        for (int i = 0; i < 3; i++) {
            bikeSlots.add(new Slot("Bike", "B" + i));
        }
        truckSlots.add(new Slot("Truck", "T1"));
    }

    Slot getAvailability(String type) {
        List<Slot> list = switch (type) {
            case "Car" -> carSlots;
            case "Bike" -> bikeSlots;
            case "Truck" -> truckSlots;
            default -> null;
        };

        if (list == null)
            return null;

        for (Slot slot : list) {
            if (slot.isEmpty()) {
                return slot;
            }
        }
        return null;
    }
}

class ParkingLot {
    List<Floor> floors = new ArrayList<>();
    Map<String, Vehicle> parkedVehicle = new HashMap<>();
    Map<String, Slot> vehicleToSlot = new HashMap<>();

    Queue<Vehicle> carWaitlist = new LinkedList<>();
    Queue<Vehicle> bikeWaitlist = new LinkedList<>();
    Queue<Vehicle> truckWaitlist = new LinkedList<>();

    ParkingLot() {
        for (int i = 1; i <= 3; i++) {
            floors.add(new Floor(i));
        }
    }

    void park(String id, String type, int entrytime) {
        Vehicle vehicle = new Vehicle(id, type, entrytime);

        for (Floor floor : floors) {
            Slot slot = floor.getAvailability(type);
            if (slot != null) {
                slot.vehicle = vehicle;
                parkedVehicle.put(id, vehicle);
                vehicleToSlot.put(id, slot);
                System.out.println("Parked vehicle " + id + " (" + type + ") at slot " + slot.slotName + " on floor "
                        + floor.floorNumber);
                return;
            }
        }

        
        switch (type) {
            case "Car" -> carWaitlist.add(vehicle);
            case "Bike" -> bikeWaitlist.add(vehicle);
            case "Truck" -> truckWaitlist.add(vehicle);
        }
        System.out.println(" Vehicle " + id + " added to " + type + " waitlist.");
    }

    void exit(String id, int exitTime) {
        if (!parkedVehicle.containsKey(id)) {
            System.out.println(" Vehicle " + id + " not found in parking lot.");
            return;
        }

        Vehicle vehicle = parkedVehicle.get(id);
        Slot slot = vehicleToSlot.get(id);
        int duration = exitTime - vehicle.entrytime;

        System.out.println(" Vehicle " + id + " exited from slot " + slot.slotName +
                " | Duration parked: " + duration + " minutes");

        slot.vehicle = null;
        parkedVehicle.remove(id);
        vehicleToSlot.remove(id);

        assignFromWaitList(slot.type, slot);
    }

    void assignFromWaitList(String type, Slot slot) {
        Queue<Vehicle> waitlist = switch (type) {
            case "Car" -> carWaitlist;
            case "Bike" -> bikeWaitlist;
            case "Truck" -> truckWaitlist;
            default -> null;
        };

        if (waitlist != null && !waitlist.isEmpty()) {
            Vehicle vehicle = waitlist.poll();
            slot.vehicle = vehicle;
            parkedVehicle.put(vehicle.id, vehicle);
            vehicleToSlot.put(vehicle.id, slot);
            System.out.println(" Assigned vehicle " + vehicle.id + " from waitlist to slot " + slot.slotName);
        }
    }

    void status() {
        System.out.println("Parking Lot Status:");
        for (Floor floor : floors) {
            System.out.println("Floor " + floor.floorNumber + ":");
            for (Slot slot : floor.carSlots) {
                String status = slot.isEmpty() ? "Empty" : "Occupied by " + slot.vehicle.id;
                System.out.println("  Slot " + slot.slotName + " (Car): " + status);
            }
            for (Slot slot : floor.bikeSlots) {
                String status = slot.isEmpty() ? "Empty" : "Occupied by " + slot.vehicle.id;
                System.out.println("  Slot " + slot.slotName + " (Bike): " + status);
            }
            for (Slot slot : floor.truckSlots) {
                String status = slot.isEmpty() ? "Empty" : "Occupied by " + slot.vehicle.id;
                System.out.println("  Slot " + slot.slotName + " (Truck): " + status);
            }
        }
    }

    void waitlist() {
        System.out.println("Waitlist Status:");
        System.out.println("Car Waitlist:");
        for (Vehicle v : carWaitlist) {
            System.out.println("  Vehicle ID: " + v.id + ", Entry Time: " + v.entrytime);
        }
        System.out.println("Bike Waitlist:");
        for (Vehicle v : bikeWaitlist) {
            System.out.println("  Vehicle ID: " + v.id + ", Entry Time: " + v.entrytime);
        }
        System.out.println("Truck Waitlist:");
        for (Vehicle v : truckWaitlist) {
            System.out.println("  Vehicle ID: " + v.id + ", Entry Time: " + v.entrytime);
        }
        
    }
}

public class Parking {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        lot.park("C101", "Car", 10);
        lot.park("B201", "Bike", 10);
        lot.park("T301", "Truck", 10);
        lot.park("C102", "Car", 11);
        lot.park("B202", "Bike", 11);
        lot.park("T302", "Truck", 11);
        lot.park("C103", "Car", 12);
        lot.park("B203", "Bike", 12);
        lot.park("T303", "Truck", 12);
        lot.park("C104", "Car", 12);
        lot.park("C105", "Car", 12);
        lot.park("C106", "Car", 12);
        lot.park("C107", "Car", 12);
        lot.park("B204", "Bike", 12);
        lot.park("B205", "Bike", 12);
        lot.park("T304", "Truck", 12);
        lot.park("C108", "Car", 13);
        lot.park("B206", "Bike", 13);
        lot.park("T305", "Truck", 13);
        lot.park("C109", "Car", 13);
        lot.park("B207", "Bike", 13);
        lot.park("T306", "Truck", 13);
        lot.park("C110", "Car", 14);
        lot.park("B208", "Bike", 14);
        lot.park("T307", "Truck", 14);
        lot.park("C111", "Car", 14);
        lot.park("B209", "Bike", 14);
        lot.park("T308", "Truck", 14);
        lot.park("C101", "Car", 15);
        lot.park("B210", "Bike", 15);
    lot.waitlist();
        lot.park("T309", "Truck", 15);     

        lot.park("C102", "Car", 11);
        lot.park("B201", "Bike", 12);
        lot.park("T301", "Truck", 13);
        lot.park("T302", "Truck", 13);
        lot.status();
        lot.park("T303", "Truck", 13);
        lot.park("T304", "Truck", 13);
        
        lot.exit("T301", 15);
        lot.exit("T302", 16);
        lot.exit("T303", 17);
        lot.exit("T304", 18);
        lot.exit("T305", 19);
        lot.exit("C101", 15);
        lot.exit("C102", 16);
        lot.exit("B201", 17);
        lot.waitlist();
        lot.status();
    }
}