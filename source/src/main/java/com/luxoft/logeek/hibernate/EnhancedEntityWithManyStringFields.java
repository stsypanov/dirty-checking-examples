package com.luxoft.logeek.hibernate;

import org.hibernate.bytecode.enhance.internal.tracker.DirtyTracker;
import org.hibernate.bytecode.enhance.internal.tracker.SimpleCollectionTracker;
import org.hibernate.bytecode.enhance.spi.CollectionTracker;
import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.ManagedEntity;
import org.hibernate.engine.spi.SelfDirtinessTracker;

public class EnhancedEntityWithManyStringFields implements ManagedEntity, SelfDirtinessTracker {

    private Long id;
    
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    
    private transient EntityEntry $$_hibernate_entityEntryHolder;
    
    private transient ManagedEntity $$_hibernate_previousManagedEntity;
    
    private transient ManagedEntity $$_hibernate_nextManagedEntity;
    
    private transient DirtyTracker $$_hibernate_tracker;
    
    private transient CollectionTracker $$_hibernate_collectionTracker;

    public EnhancedEntityWithManyStringFields() {
    }

    public void setId(Long id) {
        this.$$_hibernate_write_id(id);
    }

    public void setField1(String field1) {
        this.$$_hibernate_write_field1(field1);
    }

    public void setField2(String field2) {
        this.$$_hibernate_write_field2(field2);
    }

    public void setField3(String field3) {
        this.$$_hibernate_write_field3(field3);
    }

    public void setField4(String field4) {
        this.$$_hibernate_write_field4(field4);
    }

    public void setField5(String field5) {
        this.$$_hibernate_write_field5(field5);
    }

    public void setField6(String field6) {
        this.$$_hibernate_write_field6(field6);
    }

    public void setField7(String field7) {
        this.$$_hibernate_write_field7(field7);
    }

    public void setField8(String field8) {
        this.$$_hibernate_write_field8(field8);
    }

    public Long getId() {
        return this.$$_hibernate_read_id();
    }

    public String getField1() {
        return this.$$_hibernate_read_field1();
    }

    public String getField2() {
        return this.$$_hibernate_read_field2();
    }

    public String getField3() {
        return this.$$_hibernate_read_field3();
    }

    public String getField4() {
        return this.$$_hibernate_read_field4();
    }

    public String getField5() {
        return this.$$_hibernate_read_field5();
    }

    public String getField6() {
        return this.$$_hibernate_read_field6();
    }

    public String getField7() {
        return this.$$_hibernate_read_field7();
    }

    public String getField8() {
        return this.$$_hibernate_read_field8();
    }

    public Object $$_hibernate_getEntityInstance() {
        return this;
    }

    public EntityEntry $$_hibernate_getEntityEntry() {
        return this.$$_hibernate_entityEntryHolder;
    }

    public void $$_hibernate_setEntityEntry(EntityEntry var1) {
        this.$$_hibernate_entityEntryHolder = var1;
    }

    public ManagedEntity $$_hibernate_getPreviousManagedEntity() {
        return this.$$_hibernate_previousManagedEntity;
    }

    public void $$_hibernate_setPreviousManagedEntity(ManagedEntity var1) {
        this.$$_hibernate_previousManagedEntity = var1;
    }

    public ManagedEntity $$_hibernate_getNextManagedEntity() {
        return this.$$_hibernate_nextManagedEntity;
    }

    public void $$_hibernate_setNextManagedEntity(ManagedEntity var1) {
        this.$$_hibernate_nextManagedEntity = var1;
    }

    public void $$_hibernate_trackChange(String var1) {
        if (this.$$_hibernate_tracker == null) {
            this.$$_hibernate_tracker = new SimpleFieldTracker();
        }

        this.$$_hibernate_tracker.add(var1);
    }

    private boolean $$_hibernate_areCollectionFieldsDirty() {
        return this.$$_hibernate_collectionTracker == null ? false : false;
    }

    private void $$_hibernate_getCollectionFieldDirtyNames(DirtyTracker var1) {
        if (this.$$_hibernate_collectionTracker != null) {
            ;
        }
    }

    private void $$_hibernate_clearDirtyCollectionNames() {
        if (this.$$_hibernate_collectionTracker == null) {
            this.$$_hibernate_collectionTracker = new SimpleCollectionTracker();
        }

        Object var1 = null;
    }

    public String[] $$_hibernate_getDirtyAttributes() {
        if (this.$$_hibernate_collectionTracker == null) {
            return this.$$_hibernate_tracker == null ? new String[0] : this.$$_hibernate_tracker.get();
        } else {
            if (this.$$_hibernate_tracker == null) {
                this.$$_hibernate_tracker = new SimpleFieldTracker();
            }

            this.$$_hibernate_getCollectionFieldDirtyNames(this.$$_hibernate_tracker);
            return this.$$_hibernate_tracker.get();
        }
    }

    public boolean $$_hibernate_hasDirtyAttributes() {
        return this.$$_hibernate_tracker != null && !this.$$_hibernate_tracker.isEmpty() || this.$$_hibernate_areCollectionFieldsDirty();
    }

    public void $$_hibernate_clearDirtyAttributes() {
        if (this.$$_hibernate_tracker != null) {
            this.$$_hibernate_tracker.clear();
        }

        this.$$_hibernate_clearDirtyCollectionNames();
    }

    public void $$_hibernate_suspendDirtyTracking(boolean var1) {
        if (this.$$_hibernate_tracker == null) {
            this.$$_hibernate_tracker = new SimpleFieldTracker();
        }

        this.$$_hibernate_tracker.suspend(var1);
    }

    public CollectionTracker $$_hibernate_getCollectionTracker() {
        return this.$$_hibernate_collectionTracker;
    }

    public Long $$_hibernate_read_id() {
        return this.id;
    }

    public void $$_hibernate_write_id(Long var1) {
        this.id = var1;
    }

    public String $$_hibernate_read_field1() {
        return this.field1;
    }

    public void $$_hibernate_write_field1(String var1) {
        if (!EqualsHelper.areEqual(this.field1, var1)) {
            this.$$_hibernate_trackChange("field1");
        }

        this.field1 = var1;
    }

    public String $$_hibernate_read_field2() {
        return this.field2;
    }

    public void $$_hibernate_write_field2(String var1) {
        if (!EqualsHelper.areEqual(this.field2, var1)) {
            this.$$_hibernate_trackChange("field2");
        }

        this.field2 = var1;
    }

    public String $$_hibernate_read_field3() {
        return this.field3;
    }

    public void $$_hibernate_write_field3(String var1) {
        if (!EqualsHelper.areEqual(this.field3, var1)) {
            this.$$_hibernate_trackChange("field3");
        }

        this.field3 = var1;
    }

    public String $$_hibernate_read_field4() {
        return this.field4;
    }

    public void $$_hibernate_write_field4(String var1) {
        if (!EqualsHelper.areEqual(this.field4, var1)) {
            this.$$_hibernate_trackChange("field4");
        }

        this.field4 = var1;
    }

    public String $$_hibernate_read_field5() {
        return this.field5;
    }

    public void $$_hibernate_write_field5(String var1) {
        if (!EqualsHelper.areEqual(this.field5, var1)) {
            this.$$_hibernate_trackChange("field5");
        }

        this.field5 = var1;
    }

    public String $$_hibernate_read_field6() {
        return this.field6;
    }

    public void $$_hibernate_write_field6(String var1) {
        if (!EqualsHelper.areEqual(this.field6, var1)) {
            this.$$_hibernate_trackChange("field6");
        }

        this.field6 = var1;
    }

    public String $$_hibernate_read_field7() {
        return this.field7;
    }

    public void $$_hibernate_write_field7(String var1) {
        if (!EqualsHelper.areEqual(this.field7, var1)) {
            this.$$_hibernate_trackChange("field7");
        }

        this.field7 = var1;
    }

    public String $$_hibernate_read_field8() {
        return this.field8;
    }

    public void $$_hibernate_write_field8(String var1) {
        if (!EqualsHelper.areEqual(this.field8, var1)) {
            this.$$_hibernate_trackChange("field8");
        }

        this.field8 = var1;
    }
}
