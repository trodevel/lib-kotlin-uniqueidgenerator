# uniqueidgenerator

`uniqueidgenerator` provides unique sequence ID generation, including `PersistentUniqueIdGenerator` which persists sequence numbers in Android `SharedPreferences`.

## Interfaces & Classes

- `IUniqueIdGenerator`: Interface declaring `getNextId(): Int`.
- `PersistentUniqueIdGenerator`: Implementation using Android `SharedPreferences`.
